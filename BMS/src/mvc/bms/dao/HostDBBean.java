package mvc.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import mvc.bms.dto.BookDataBean;

public class HostDBBean implements HostDao {
	DataSource dataSource;
	
	private static HostDBBean instance;
	
	public static HostDBBean getInstance() {
		if (instance == null) {
			instance = new HostDBBean();
		}
		return instance;
	}
	
	private HostDBBean() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addBook(String title, String writer_name, String price) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "insert into books values (seq_book_code.NEXTVAL,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, writer_name);
			pstmt.setInt(3, Integer.parseInt(price));
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
	
	public int deleteBook(String book_code) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "delete books where book_code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(book_code));
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
	
	public int modifyBook(BookDataBean book) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
			String sql = "update books set title=?, writer_name=?, price=? where book_code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter_name());
			pstmt.setInt(3, Integer.parseInt(book.getPrice()));
			pstmt.setInt(4, Integer.parseInt(book.getBook_code()));
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
