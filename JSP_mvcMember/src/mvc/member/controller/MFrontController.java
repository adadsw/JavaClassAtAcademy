package mvc.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.handler.*;

@WebServlet("*.do")
public class MFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MFrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("UTF-8");

		String viewPage = null;
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = uri.substring(contextPath.length()); // beginIndex

		try {
			switch (com) {
			case "/main.do":
				System.out.println("main.do");
				viewPage = "/member/main.jsp";
				break;
			case "/memberInputForm.do":
				System.out.println("memberInputForm.do");
				viewPage = "/member/inputForm.jsp";
				break;
			case "/confirmId.do":
				System.out.println("confirmId.do");
				ConfirmIdHandler confirmIdHandler = new ConfirmIdHandler();
				viewPage = confirmIdHandler.process(request, response);
				break;
			case "/memberInputPro.do":
				System.out.println("memberInputPro.do");
				InputProHandler inputProHandler = new InputProHandler();
				viewPage = inputProHandler.process(request, response);
 				break;
			case "/loginForm.do":
				System.out.println("loginForm.do");
				LoginFormHandler loginFormHandler = new LoginFormHandler();
				viewPage = loginFormHandler.process(request, response);
				break;
			case "/loginPro.do":
				System.out.println("loginPro.do");
				LoginProHandler loginProHandler = new LoginProHandler();
				viewPage = loginProHandler.process(request, response);
				break;
			case "/logout.do":
				System.out.println("logout.do");
				LogoutHandler logoutHandler = new LogoutHandler();
				viewPage = logoutHandler.process(request, response);
				break;
			case "/memberDeleteForm.do":
				System.out.println("memberDeleteForm.do");
				viewPage = "/member/deleteForm.jsp";
				break;
			case "/memberDeletePro.do":
				System.out.println("memberDeletePro.do");
				DeleteProHandler deleteProHandler = new DeleteProHandler();
				viewPage = deleteProHandler.process(request, response);
				break;
			case "/memberModifyForm.do":
				System.out.println("memberModifyForm.do");
				viewPage = "/member/modifyForm.jsp";
				break;
			case "/memberModifyView.do":
				System.out.println("memberModifyView.do");
				ModifyViewHandler modifyViewHandler = new ModifyViewHandler();
				viewPage = modifyViewHandler.process(request, response);
				break;
			case "/memberModifyPro.do":
				System.out.println("memberModifyPro.do");
				ModifyProHandler modifyProHandler = new ModifyProHandler();
				viewPage = modifyProHandler.process(request, response);
				break;
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}
}
