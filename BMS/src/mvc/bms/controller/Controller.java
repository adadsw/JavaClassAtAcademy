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
    
    // 1�ܰ�. HTTP ��û ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doProcess(request, response);
	}
	
	/*<Ŀ�ǵ�, �ڵ鷯�ν��Ͻ�> ���������� �����ϱ� ����
	�� init() �޼��带 ���ؼ� �������Ͽ� ����� '��ɾ�=�ڵ鷯'�� ���������� ����
	<��ɾ�, �ڵ鷯Ŭ������ �ν��Ͻ�> ���������� handlerMap�� ����ȴ�.
	*/
    private Map<String, Object> handlerMap = new Hashtable<String, Object>();
    /*  web.xml ��������
     *  	<init-param>
     *  	  <param-name>configFile</param-name>
     *  	  <param-value>C:/dev/workspace/JSP_mvcMember/WebContent/WEB-INF/config.properties</param-value>
     *  	</init-param>
     */   
    public void init(ServletConfig config) throws ServletException {
    	
    	// web.xml���� ������ configFile �ʱ�ȭ �Ķ���ͷκ���, ���������� �����ϰ� �ִ� ���������� ��θ� ���Ѵ�.
    	String configFile = config.getInitParameter("configFile");
    	FileInputStream fis = null;
    	Properties prop = null;
    	
    	try {
    		// �������� web.xml�� ����� config.properties�� ���������� �о�ͼ�
			fis = new FileInputStream(configFile);
			prop = new Properties();
			prop.load(fis);
			
			// Properties��ü keys�� �����Ѵ�.
			Iterator<Object> keys = prop.keySet().iterator();
			while(keys.hasNext()) {
				/* config.properties ���� ����
				 * 	==>  /main.do=mvc.member.handler.MainHandler
				 * 	Properties ��ü�� ����� ���������� keys�� �̿��Ͽ�
				 * 	<��ɾ�, �ڵ鷯�ν��Ͻ�>�� ���������� handlerMap�� ����
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
    	
    	// 2�ܰ�. Ŭ���̾�Ʈ ��û�ľ�
    	String command = request.getRequestURI(); // command = /JSP_mvcMember/main.do
    	
    	if (command.indexOf(request.getContextPath()) == 0) { // ��θ��� �ִٸ�
    		command = command.substring(request.getContextPath().length()); // ��θ��� �����ϰ�
    	}
    	
    	// command �� /main.do��� key�� �̿��ؼ�, value �� Map�� ����ִ� handler�� MainHandler�� ������
    	// handler = MainHandler
    	// CommandHandler handler = MainHandler;
    	// CommandHandler�� �������̽��̸�, �������� �����Ͽ� Type���� ���� �� �ִ�.
    	// MainHandler�� �θ��� CommandHandler �������̽��� implements�ؼ� process()�� �������̵� �ؾ��Ѵ�.
    	// CommandHandler�� �޼��� process()�� �����ϵ��� �ϱ� ����.
    	CommandHandler handler = (CommandHandler) handlerMap.get(command);
    	if (handler == null || handler.equals("")) {
    		handler = new DefaultHandler();
    	}
    	
    	String viewPage = null;
    	
    	try {
    		/*	CommandHandler �������̽�
    		 *  3�ܰ�. ���� ����Ͽ� ��û�� ����� �����Ѵ�.
    		 *  4�ܰ�. request�� session�� ó������� �����Ѵ�.
    		 *  
    		 *  ��, ���� �ڵ鷯 �ν��Ͻ�(MainHandler)�� process() �޼��带 ȣ���ؼ� ��û�� ó���ϰ�,
    		 *  ����� ������ ���������� URI�� ���ϰ����� ���޹޴´�.
    		 *  �ڵ鷯 �ν��Ͻ��� handler�� process() �޼���� Ŭ���̾�Ʈ�� ��û�� �˸°� ó���� ��,
    		 *  �� �������� ������ ������� request�� session�� �Ӽ��� �����ؾ� �Ѵ�.
    		 */
    		viewPage = handler.process(request, response); // viewPage = /member/main.jsp
		} catch (Throwable e) {
			e.getStackTrace();
		}
    	// 5�ܰ�. RequestDispatcher�� ����Ͽ� �˸��� ��� ������
    	// dispatcher = org.apache.catalina.core.ApplicationDespatcher@�ּҰ�
    	// RequestDispatcher : ���� �Ǵ� JSP���� ��û�� ���� �� �ٸ� ������Ʈ�� ��û�� �����ϴ� Ŭ�����̴�.
    	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
    	dispatcher.forward(request, response);
    }



}
