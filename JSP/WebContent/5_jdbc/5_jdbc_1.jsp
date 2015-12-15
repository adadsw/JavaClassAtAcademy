<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! Connection connection;
	PreparedStatement pstmt;
	ResultSet resultSet;
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String uid="scott";
	String upwd="tiger";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try {
		Class.forName(driver); /* 메모리에 JDBC 드라이버 즉 OracleDriver가 로드된다.*/
		connection = DriverManager.getConnection(url, uid, upwd); /* Connection 객체 생성함(JDBC URL, 계정아이디, 비밀번호)*/
		String sql="select * from crew where id=?";
		pstmt = connection.prepareStatement(sql);  /* PreparedStatement는 SQL쿼리의 틀을 미리 생성해 놓고 값을 나중에 지정한다.*/
		pstmt.setString(1, "id");
		resultSet = pstmt.executeQuery();/* SQL문의 결과값을 ResultSet 객체로 받는다. */
												  /* executeQuery() : SQL문 실행 후 여러개의 결과값이 생기는 경우*/
												  /* executeUpdate() : SQL문 실행 후 테이블의 내용만 변경되는 경우*/
		
	/* 테이블 insert 후 commit; 컬럼명 일치시킬 것 */
		out.println("<table border='1'> <tr> <th>ID</th><th>PASSWORD</th><th>이름</th><th>전화번호</th><th>주소</th></td>");
		while(resultSet.next()) { /*다음 레코드로 이동*/
			String id = resultSet.getString("id"); /* resultSet.getString(컬럼명) */
			String passwd = resultSet.getString("passwd");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String address = resultSet.getString("address");
			
			out.println("<tr><td>" + id + "</td><td>" + passwd + "</td><td>" + name + "</td><td>" + email + "</td><td>" + address + "</td></tr>");
		}
		out.println("</table>");
		
	} catch(SQLException ex) {
		out.println(ex.getMessage());
		ex.printStackTrace();
	} finally { /* try catch 문에서 반드시 실행하는 부분으로, 반대 순서로 close 처리할 것*/
		try {
			if(resultSet != null) resultSet.close();
			if(resultSet != null) pstmt.close();
			if(connection != null) connection.close();
		} catch(SQLException ex) {}
	}
%>
</body>
</html>