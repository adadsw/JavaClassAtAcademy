package mvc.bms.dao;

import javax.naming.*;
import javax.sql.*;

import mvc.bms.dto.OrderDataBean;
import mvc.bms.dto.OrderListDataBean;

import java.sql.*;
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
		OrderListDataBean orderList = null;
		OrderDataBean order = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "select * from orders order by order_code";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (orderList == null) {
					orderList = new OrderListDataBean();
				}
				order = new OrderDataBean();
				order.setOrder_code(rs.getInt(1));
				order.setUser_id(rs.getString(2));
				order.setBook_code(rs.getInt(3));
				order.setOrder_date(rs.getTimestamp(4));
				orderList.addOrder(order);
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
		return orderList.getOrderList();
	}

	public List<OrderDataBean> listOrders(String User_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
