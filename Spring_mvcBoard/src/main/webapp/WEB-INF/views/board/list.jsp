<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="spring.mvc.board.dto.BDto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="spring.mvc.board.dao.BDao" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="setting.jsp" %>
<link type="text/css" rel="stylesheet" href="${project}style.css">

<h2> 글목록 (글갯수 : ${count})</h2>

<table>
	<tr>
		<th colspan="6" align="right" style="height: 25px">
			<a href="writeForm">글쓰기</a></th>
	</tr>
	<tr>
		<th style="width: 5%"> 글번호 </th>
		<th style="width: 35%"> 글제목 </th>
		<th style="width: 10%"> 작성자 </th>
		<th style="width: 15%"> 작성일 </th>
		<th style="width: 5%"> 조회수 </th>
		<th style="width: 10%"> IP </th>		
	</tr>
	
	<c:if test="${count > 0}">
		<c:forEach var="dto" items="${list}">
			<tr>
				<td align="center">
					${number}
					<c:set var="number" value="${number -1}"/>
				</td>
				<!-- 추가 Start -->
				<td>
					<c:if test="${dto.re_level > 1}">
						<c:set var="wid" value="${(dto.re_level-1) * 10}"/>
						<img src="${project}images/level.gif" border="0" width="${wid}" height="15">
					</c:if>	
				<!-- 추가 End -->
					<c:if test="${dto.re_level > 0}">
						<img src="${project}images/re.gif" border="0" width="20" height="15">
					</c:if>
					<a href="contentForm?num=${dto.num}&pageNum=${pageNum}&number=${number+1}">${dto.subject}</a>
					<c:if test="${dto.readcount > 20}">
						<img src="${project}images/hot.gif" border="0" width="20" height="15">
					</c:if>
				</td> 
				<!-- 작성자 -->
				<td align="center">
					${dto.writer}
				</td>
				<!-- 작성일 -->
				<td align="center">
					<fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm" value="${dto.reg_date}"/> 
				</td>
				<td align="center">
					${dto.readcount}
				</td>
				<td align="center">
					${dto.ip}
				</td>
			</tr>
		</c:forEach>
	</c:if>
	<c:if test="${count == 0}">
		<!-- 글이 없는 경우 -->http://localhost:8081/portfolio/
		<tr>
			<td colspan="6" align="center" style="height:40px">
				게시판에 글이 없습니다. 글쓰기를 선택해 주세요.
			</td>
		</tr>
	</c:if>
	</table>
	<br>
	<c:if test="${count > 0}">
		<!-- 처음[◀◀] 이전[▶▶] -->
		<c:if test="${startPage > pageBlock}">
			<a href="list">[◀◀]</a>
			<a href="list?pageNum=${startPage - pageBlock - 1}">[◀]</a>
		</c:if>
		<c:forEach var="i" begin="${startPage}" end="${endPage}">
			<c:if test="${i == currentPage}">
				<b>[${i}]</b>
			</c:if>
			<c:if test="${i != currentPage}">
				<a href="list?pageNum=${i}">[${i}]</a>
			</c:if>
		</c:forEach>
		
		<!-- 다음[▶] 끝[▶▶] -->
		<c:if test="${pageCount > endPage}">
			<a href="list?pageNum=${startPage + pageBlock}">[▶]</a>
			<a href="list?pageNum=${pageCount}">[▶▶]</a>		
		</c:if>
	</c:if>