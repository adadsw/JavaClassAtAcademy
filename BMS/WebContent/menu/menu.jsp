<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/bms/setting.jsp" %>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<body>
	<header>
		${user_id}로 접속 중
	</header>
	<article>
		<nav class="sidebar">
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
				<li>
						<a href="guestRefund.do" target="link">환불</a>
				</li>
		</c:if>
				<li>
					<a href="logout.do">로그아웃</a>
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
