<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/resources/setting.jsp" %>
<meta name="viewport" content="user-scalable=no, width=device-width"/>
<body class="body">
	<header class="head">
		${user_id}로 접속 중
	</header>
	<article>
		<nav class="sidebar">
			<ul>
		<!-- host 접속 -->
		<c:if test="${user_id == 'host'}">
				<li>
						<a href="hostBookManagement" target="link">재고관리</a>
				</li>
				<li>
						<a href="hostOrderManagement" target="link">주문목록</a>
				</li>
		</c:if>
		<!-- guest 접속 -->
		<c:if test="${user_id != 'host'}">
				<li>
						<a href="guestBookPurchase" target="link">책 구매</a>
				</li>
				<li>
						<a href="guestRefund" target="link">환불</a>
				</li>
		</c:if>
				<li>
					<a href="logout">로그아웃</a>
				</li>
			</ul>
		</nav>
	<section>
		<iframe name="link" class='entries'></iframe>
	</section>
	</article>
	<footer class="foot">
		<p>Copyright &copy;OSH 2016 All rights Reserved</p>
	</footer>
</body>
