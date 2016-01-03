<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/bms/setting.jsp" %>
<body>
<header>${user_id}로 접속 중</header>
<nav>
	<ul>
<!-- host 접속 -->
<c:if test="${user_id == 'host'}">
		<li>
				<a href="hostBookManagement.do" target="link">재고관리</a>
		</li>
		<li>
				<a href="hostOrderManagement.do" target="link">주문목록</a>
		</li>
</c:if>
<!-- guest 접속 -->
<c:if test="${user_id != 'host'}">
		<li>
				<a href="guestBookPurchase.do" target="link">책 구매</a>
		</li>
<!-- 	<li>
				<a href="guestBag.do" target="link">장바구니</a>
		</li> -->
		<li>
				<a href="guestRefund.do" target="link">환불</a>
		</li>
</c:if>
		<li>
			<a href="logout.do">로그아웃</a>
		</li>
	</ul>
</nav>
	<iframe src="" name="link">
	</iframe>
</body>
