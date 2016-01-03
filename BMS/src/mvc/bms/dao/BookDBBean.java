package mvc.bms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.*;
import javax.sql.DataSource;

import mvc.bms.dto.BookDataBean;

public class BookDBBean implements BookDao {
DataSource dataSource;
	
	private static BookDBBean instance;
	
	public static BookDBBean getInstance() {
		if (instance == null) {
			instance = new BookDBBean();
		}
		return instance;
	}
	
	private BookDBBean() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<BookDataBean> listBook() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookDataBean> bookList = null;
		BookDataBean book = null;
		try {
			con = dataSource.getConnection();
			String sql = "select * from books order by BOOK_CODE";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (bookList == null) {
					bookList = new ArrayList<BookDataBean>();
				}
				book = new BookDataBean();
				book.setBook_code(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setWriter_name(rs.getString(3));
				book.setPrice(rs.getString(4));
				bookList.add(book);
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
		return bookList;
	}
	
	public BookDataBean aBook(String book_code) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookDataBean book = new BookDataBean();
		try {
			con = dataSource.getConnection();
			String sql = "select * from books where book_code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book_code);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				book = new BookDataBean();
				book.setBook_code(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setWriter_name(rs.getString(3));
				book.setPrice(rs.getString(4));
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
		return book;
	}
}
