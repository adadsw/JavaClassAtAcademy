<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>forEach</title>
<c:forEach var="cnt" begin="1" end="5">
	<font size="${cnt}">야~호~</font><br>
</c:forEach>

<c:forEach var="i" begin="1" end="10" step="2">
	${i}
</c:forEach>