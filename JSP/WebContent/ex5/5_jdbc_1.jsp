<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection connection;
	PreparedStatement pstmt;
	ResultSet resultSet;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String upwd = "tiger";
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
		String sql = "select * from crew where id=?";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, "id");
		resultSet = pstmt.executeQuery();
		
		while(resultSet.next()) {
			String id = resultSet.getString("id");
			String passwd = resultSet.getString("passwd");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String address = resultSet.getString("address");
			
			out.println("아이디 : " + id + " 비밀번호 : " + passwd + " 이름 : " + name + "이메일 : " + email + " 주소 : " +address + "<br/>"); 
		}
	} catch(Exception e) {
	} finally {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (resultSet != null) {
				pstmt.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch(Exception e) {
			
		}
	}
%>
</body>
</html>