package mvc.bms.dao;

import javax.naming.*;
import javax.sql.*;

import mvc.bms.dto.OrderDataBean;
import mvc.bms.dto.OrderRefundDataBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDBBean implements OrderDao {
	DataSource dataSource;
	
	private static OrderDBBean instance;
	
	public static OrderDBBean getInstance() {
		if (instance == null) {
			instance = new OrderDBBean();
		}
		return instance;
	}
	
	private OrderDBBean() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<OrderDataBean> listOrders() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<OrderDataBean> orderList = null;
		OrderDataBean order = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "select * from orders order by order_code";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (orderList == null) {
				orderList = new ArrayList<OrderDataBean>();
				}
				order = new OrderDataBean();
				order.setOrder_code(rs.getInt(1));
				order.setUser_id(rs.getString(2));
				order.setBook_code(rs.getInt(3));
				order.setOrder_date(rs.getTimestamp(4));
				orderList.add(order);
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
		return orderList;
	}

	public List<OrderRefundDataBean> listRefundOrders(String user_id) { //환불 목록
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<OrderRefundDataBean> orderList = null;
		OrderRefundDataBean order = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "select order_code, title, writer_name, order_date from orders o , books b "
					+ "where o.book_code=b.book_code "
					+ "and user_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (orderList == null) {
					orderList = new ArrayList<OrderRefundDataBean>();
				}
				order = new OrderRefundDataBean();
				order.setOrder_code(rs.getInt(1));
				order.setTitle(rs.getString(2));
				order.setWriter_name(rs.getString(3));
				order.setOrder_date(rs.getTimestamp(4));
				orderList.add(order);
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
		return orderList;
	}
}
