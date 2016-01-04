<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javalec.bean.EL_8_ProductInfo" %>
<%
	EL_8_ProductInfo product = new EL_8_ProductInfo();
	product.setName("초코케익 3호");
	product.setPrice(20000);

	request.setAttribute("product", product);
	RequestDispatcher dispatcher = request.getRequestDispatcher("el_9.jsp");
	dispatcher.forward(request, response);
%> 