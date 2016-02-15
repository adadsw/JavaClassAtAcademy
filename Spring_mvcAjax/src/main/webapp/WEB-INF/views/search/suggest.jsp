<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String keywords[] = {
		"자바 프로그래밍", "자바입문", "자바의 정석", "자바지기",
		"Ajax 입문", "Ajax 기술서", "Ajax 웹프로그래밍",
		"스프링 프레임워크", "스프링 프로그래밍",
		"JQuery 입문"
	};
	
	public List<String> search(String keyword) {
		List<String> list = null;
		
		if (keyword == null || keyword.equals("")) {
			return Collections.EMPTY_LIST;
		}
		
		list = new ArrayList<String>();
		for(int i = 0; i < keywords.length; i++) {
			if (keywords[i].startsWith(keyword)) {	// 넘겨받은 키워드로 시작하는 문자열인가?
				list.add(keywords[i]);
			}
		}
		return list;
	}
%>

<%
	request.setCharacterEncoding("utf-8");
	String keyword = request.getParameter("keyword");
	
	List<String> list = search(keyword);
%>
<%= list.size() %>| 
<%
	for (int i = 0; i < list.size(); i++) {
%>		
	<%=list.get(i)%>
	<%
		if (i < list.size() -1) { //맨 마지막 바로 전에 ',' 추가
	%>
	,
<%
		}
	}
%>