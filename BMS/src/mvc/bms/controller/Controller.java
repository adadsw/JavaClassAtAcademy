package mvc.bms.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.handler.CommandHandler;
import mvc.bms.handler.DefaultHandler;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
        super();
    }
    
    // 1단계. HTTP 요청 받음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request, response);
	}
	
	/*<커맨드, 핸들러인스턴스> 매핑정보를 저장하기 위함
	즉 init() 메서드를 통해서 설정파일에 명시한 '명령어=핸들러'의 매핑정보에 따라서
	<명령어, 핸들러클래스의 인스턴스> 매핑정보가 handlerMap에 저장된다.
	*/
    private Map<String, Object> handlerMap = new Hashtable<String, Object>();
    /*  web.xml 설정파일
     *  	<init-param>
     *  	  <param-name>configFile</param-name>
     *  	  <param-value>C:/dev/workspace/JSP_mvcMember/WebContent/WEB-INF/config.properties</param-value>
     *  	</init-param>
     */   
    public void init(ServletConfig config) throws ServletException {
    	
    	// web.xml에서 설정한 configFile 초기화 파라미터로부터, 매핑정보를 저장하고 있는 설정파일의 경로를 구한다.
    	String configFile = config.getInitParameter("configFile");
    	FileInputStream fis = null;
    	Properties prop = null;
    	
    	try {
    		// 설정파일 web.xml에 기술한 config.properties의 매핑정보를 읽어와서
			fis = new FileInputStream(configFile);
			prop = new Properties();
			prop.load(fis);
			
			// Properties객체 keys에 저장한다.
			Iterator<Object> keys = prop.keySet().iterator();
			while(keys.hasNext()) {
				/* config.properties 파일 내용
				 * 	==>  /main.do=mvc.member.handler.MainHandler
				 * 	Properties 객체에 저장된 매핑정보인 keys를 이용하여
				 * 	<명령어, 핸들러인스턴스>의 매핑정보를 handlerMap에 저장
				 */				
				String command = (String) keys.next();	// command = /main.do
				String className = (String) prop.getProperty(command); // className = mvc.member.handler.MainHandler
				Class<?> handlerClass = Class.forName(className);
				Object handler = handlerClass.newInstance();
				handlerMap.put(command, handler);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
    	request.setCharacterEncoding("utf-8");
    	
    	// 2단계. 클라이언트 요청파악
    	String command = request.getRequestURI(); // command = /JSP_mvcMember/main.do
    	
    	if (command.indexOf(request.getContextPath()) == 0) { // 경로명이 있다면
    		command = command.substring(request.getContextPath().length()); // 경로명을 삭제하고
    	}
    	
    	// command 즉 /main.do라는 key를 이용해서, value 즉 Map에 들어있는 handler인 MainHandler를 가져옴
    	// handler = MainHandler
    	// CommandHandler handler = MainHandler;
    	// CommandHandler는 인터페이스이며, 다형성을 적용하여 Type으로 받을 수 있다.
    	// MainHandler는 부모인 CommandHandler 인터페이스를 implements해서 process()를 오버라이딩 해야한다.
    	// CommandHandler의 메서드 process()를 구현하도록 하기 위함.
    	CommandHandler handler = (CommandHandler) handlerMap.get(command);
    	if (handler == null || handler.equals("")) {
    		handler = new DefaultHandler();
    	}
    	
    	String viewPage = null;
    	
    	try {
    		/*	CommandHandler 인터페이스
    		 *  3단계. 모델을 사용하여 요청한 기능을 수행한다.
    		 *  4단계. request나 session에 처리결과를 저장한다.
    		 *  
    		 *  즉, 구한 핸들러 인스턴스(MainHandler)의 process() 메서드를 호출해서 요청을 처리하고,
    		 *  결과로 보여줄 뷰페이지의 URI를 리턴값으로 전달받는다.
    		 *  핸들러 인스턴스인 handler의 process() 메서드는 클라이언트의 요청을 알맞게 처리한 후,
    		 *  뷰 페이지에 보여줄 결과값을 request나 session의 속성에 저장해야 한다.
    		 */
    		viewPage = handler.process(request, response); // viewPage = /member/main.jsp
		} catch (Throwable e) {
			e.getStackTrace();
		}
    	// 5단계. RequestDispatcher를 사용하여 알맞은 뷰로 포워딩
    	// dispatcher = org.apache.catalina.core.ApplicationDespatcher@주소값
    	// RequestDispatcher : 서블릿 또는 JSP에서 요청을 받은 후 다른 컴포넌트로 요청을 위임하는 클래스이다.
    	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
    	dispatcher.forward(request, response);
    }
}
