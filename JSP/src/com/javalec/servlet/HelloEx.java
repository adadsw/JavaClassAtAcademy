package com.javalec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloEx")
public class HelloEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloEx() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// GET방식: URL 값으로 정보가 전송되어 보안에 취약하다.
		// <form method="get" .. >
		
		System.out.println("Hello Servlet~");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();	//웹 브라우저에 출력하기 위한 스트림
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>hello world.</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close(); // 마지막에 출력 객체를 닫는다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//POST 방식: header를 이용해 정보가 전송되므로 보안에 강하다.
		// <form method="post" .. >
	}

}
