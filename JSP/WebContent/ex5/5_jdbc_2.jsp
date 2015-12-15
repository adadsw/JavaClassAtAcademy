<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection connection;
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
		Class.forName(driver);
		connection = DriverManager.getConnection(url, uid, upwd);
		String sql="select * from student where studentnum=?";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, "1");
		resultSet = pstmt.executeQuery();
		
		while (resultSet.next()) {
			int studentNum = resultSet.getInt("studentnum");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			int grade = resultSet.getInt("grade");
			
			out.print("번호 :" + studentNum + " 이름: " + name + " 나이: " + age + " 학년: " + grade + "<br/>");
		}
	} catch (Exception e) {
		
	} finally {
		try {
			if (resultSet != null) resultSet.close();
			if (resultSet != null) pstmt.close();
			if (connection != null) connection.close();
		} catch(Exception e) {
			
		}
	}
%>

</body>
</html>