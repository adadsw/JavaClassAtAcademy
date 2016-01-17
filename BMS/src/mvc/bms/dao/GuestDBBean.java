package mvc.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class GuestDBBean implements GuestDao {
	DataSource dataSource;
	
	private static GuestDBBean instance;
	
	public static GuestDBBean getInstance() {
		if (instance == null) {
			instance = new GuestDBBean();
		}
		return instance;
	}
	
	private GuestDBBean() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int purchaseBook(String user_id, String book_code) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "insert into orders values (seq_order_code.NEXTVAL,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setInt(2, Integer.parseInt(book_code));
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return result;
	}
	
	public int refundBook(String order_code) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "delete orders where order_code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(order_code));
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return result;
	}
}
