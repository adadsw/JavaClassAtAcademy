<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%!
	Connection connection;
	PreparedStatement pstmt;
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oralce:thin:@localhost:1521:xe";
	String uid="scott";
	String upwd="tiger";
	ResultSet resultSet;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>삽입페이지</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	
	try {
		Class.forName(driver);
		connection = DriverManager.getConnection(url, uid, upwd);
/* 		String sql = "insert into crew(id, passwd, name, email, address) values(?,?,?,?,?)";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.setString(4, email);
		pstmt.setString(5, address);
		pstmt.executeUpdate(); */
		/* INSERT END*/
		
		String sql = "update crew set address=? where id=?";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, address);
		pstmt.setString(2, id);
		pstmt.executeUpdate();
		/* UPDATE END*/
		
		sql = "select * from crew where id=?";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, id);
		resultSet = pstmt.executeQuery();	
		resultSet.next();
		id = resultSet.getString("id");
		passwd = resultSet.getString("passwd");
		name = resultSet.getString("name");
		email = resultSet.getString("email");
		address = resultSet.getString("address");
%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>PASSWORD</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>ADDRESS</th>
		</tr>
		<tr>
			<td><%=id%></td>
			<td><%=passwd%></td>
			<td><%=name%></td>
			<td><%=email%></td>
			<td><%=address%></td>
		</tr>
	</table>
<%
	} catch (SQLException ex) {
		out.println(ex.getMessage());
		ex.getStackTrace();
	} finally {
		try {
			if (resultSet != null) resultSet.close();
			if (resultSet != null) pstmt.close();
			if (connection != null) connection.close();
		} catch(SQLException ex) {}
	}
%>
</body>
</html>