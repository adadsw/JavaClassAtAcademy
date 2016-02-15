<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--<%@ page import="spring.mvc.board.dto.BDto" %> --%>
<%@ include file="setting.jsp" %>
<link type="text/css" rel="stylesheet" href="${project }style.css">

<h2>글보기</h2>

<table>
	<tr>
		<th style="width: 150px"> 글번호 </th>
		<th style="width: 150px" align="center"> ${number} </th> <!-- db 글번호가 아닌 현재 글번호 -->
		<th style="width: 150px"> 조회수 </th>
		<th style="width: 150px" align="center"> ${dto.readcount} </th>		
	</tr>
	<tr>
		<th> 작성자 </th>
		<td align="center"> ${dto.writer} </td>
		<th> 작성일 </th>
		<td align="center"> 
			<fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm" value="${dto.reg_date}"/> 
		</td>
	</tr>
	<tr>
		<th> 글제목 </th>
		<td>${dto.subject}</td>
		<th> 이메일 </th>
		<td>${dto.email}</td>
	</tr>
	<tr>
		<th> 글내용 </th>
		<td colspan="3">
			<pre>${dto.content}</pre>
		</td>
	</tr>
	<tr>
		<th colspan="4">
			<input class="inputbutton" type="button" value="글수정" 
				onclick="window.location='modifyForm?num=${dto.num}&pageNum=${pageNum}'">
			<input class="inputbutton" type="button" value="글삭제"
				onclick="window.location='deleteForm?num=${dto.num}&pageNum=${pageNum}'">
			<input class="inputbutton" type="button" value="답글쓰기"
				onclick="window.location='writeForm?num=${dto.num}&ref=${dto.ref}&re_step=${dto.re_step}&re_level=${dto.re_level}'">
			<input class="inputbutton" type="button" value="목록보기"
				onclick="window.location='list?pageNum=${pageNum}'">
		</th>
	</tr>
</table>