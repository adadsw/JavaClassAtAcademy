<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/bms/setting.jsp" %>
<body>
<header>${memId}�� �������Դϴ�.</header>
<nav>
	<ul>
<!-- host ���� -->
<c:if test="${memId == 'host'}">
		<li>
				<a href="hostBookManagement.do" target="link">������</a>
		</li>
		<li>
				<a href="hostOrderManagement.do" target="link">�ֹ����</a>
		</li>
</c:if>
<!-- guest ���� -->
<c:if test="${memId != 'host'}">
		<li>
				<a href="guestBookPurchase.do" target="link">����</a>
		</li>
		<li>
				<a href="guestBag.do" target="link">��ٱ���</a>
		</li>
		<li>
				<a href="guestRefund.do" target="link">ȯ��</a>
		</li>
</c:if>
		<li>
			<a href="logout.do">�α׾ƿ�</a>
		</li>
	</ul>
</nav>
	<iframe src="" name="link">
	</iframe>
</body>
