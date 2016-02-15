package spring.mvc.bms.dao;

import javax.naming.*;
import javax.sql.*;
import java.sql.*;
public class UserDBBean implements UserDao {
	DataSource dataSource;
	
	private static UserDBBean instance;
	
	public static UserDBBean getInstance() {
		if (instance == null) {
			instance = new UserDBBean();
		}
		return instance;
	}
	
	private UserDBBean() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int check(String user_id, String pw) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "select * from users where user_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (pw.equals(rs.getString("pw"))) {
					result = 1;
				} else {
					result = -1;
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return result;
	}
}
