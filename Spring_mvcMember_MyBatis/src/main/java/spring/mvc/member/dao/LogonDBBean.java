package spring.mvc.member.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.member.dto.LogonDataBean;

@Repository
public class LogonDBBean implements LogonDao {

	// 마이바티스 추가 시작
	@Autowired
	private SqlSession sqlSession;
	// 마이바티스 추가 종료
	
//	DataSource dataSource;

	// 싱글톤 방식
	/*
	 * private static LogonDBBean instance;
	 * 
	 * public static LogonDBBean getInstance() { if (instance == null) {
	 * instance = new LogonDBBean(); } return instance; }
	 * 
	 * private LogonDBBean() { try { Context context = new InitialContext();
	 * dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	public int checkPwd(Map<String, String> map) {
		int result = 0;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		result = logonDao.check(map.get("id"));
		if (result == 1) {
			result = -1;
			if (logonDao.checkPwd(map) == 1) {
				result = 1;
			}
		}
		return result;
		/*
		 * int result = 0; Connection con = null; PreparedStatement pstmt =
		 * null; ResultSet rs = null;
		 * 
		 * try { con = dataSource.getConnection(); String sql =
		 * "SELECT * FROM mvc_member WHERE id=?"; pstmt =
		 * con.prepareStatement(sql); pstmt.setString(1, id); rs =
		 * pstmt.executeQuery(); if (rs.next()) { //로그인 한 id에 해당하는 레코드가 있고 if
		 * (passwd.equals(rs.getString("passwd"))) { result = 1; } else { result
		 * = -1; } } else { //로그인 한 id에 해당하는 레코드가 없으면 result = 0; result = 0; }
		 * rs.next(); } catch (SQLException e) { e.printStackTrace(); } finally
		 * { try { if (rs != null) rs.close(); if (pstmt != null) pstmt.close();
		 * if (con != null) con.close(); } catch (SQLException e2) {
		 * e2.printStackTrace(); } }
		 * 
		 * return result;
		 */
	}

	public int check(String id) {
		int result = 0;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		result = logonDao.check(id);
		return result;

		/*
		 * int result = 0; Connection con = null; PreparedStatement pstmt =
		 * null; ResultSet rs = null; try { con = dataSource.getConnection();
		 * String sql = "SELECT id FROM mvc_member where id=?"; pstmt =
		 * con.prepareStatement(sql); pstmt.setString(1, id); rs =
		 * pstmt.executeQuery(); if (rs.next()) { result = 1; } } catch
		 * (Exception e) { e.printStackTrace(); } finally { try { if (rs !=
		 * null) rs.close(); if (pstmt != null) pstmt.close(); if (con != null)
		 * con.close(); } catch (Exception e2) { e2.printStackTrace(); } }
		 * return result;
		 */
	}

	public int insertMember(LogonDataBean dto) {
		int result = 0;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		result = logonDao.insertMember(dto);
		return result;
		/*
		 * int result = 0; Connection con = null; PreparedStatement pstmt =
		 * null; try { con = dataSource.getConnection(); String sql =
		 * "insert into mvc_member (id,passwd,name,jumin1,jumin2,tel,email,reg_date) values (?,?,?,?,?,?,?,?)"
		 * ; pstmt = con.prepareStatement(sql); pstmt.setString(1, dto.getId());
		 * pstmt.setString(2, dto.getPasswd()); pstmt.setString(3,
		 * dto.getName()); pstmt.setString(4, dto.getJumin1());
		 * pstmt.setString(5, dto.getJumin2()); pstmt.setString(6,
		 * dto.getTel()); pstmt.setString(7, dto.getEmail());
		 * pstmt.setTimestamp(8, dto.getReg_date()); result =
		 * pstmt.executeUpdate(); } catch (SQLException e) { e.getStackTrace();
		 * } finally { try { if (pstmt != null) pstmt.close(); if (con != null)
		 * con.close(); } catch (SQLException e) { e.getStackTrace(); } } return
		 * result;
		 */
	}

	public int deleteMember(String id) {
		int result = 0;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		result = logonDao.deleteMember(id);
		return result;
		/*
		 * int result = 0; Connection con = null; PreparedStatement pstmt =
		 * null; try { con = dataSource.getConnection(); String sql =
		 * "delete from mvc_member where id=?"; pstmt =
		 * con.prepareStatement(sql); pstmt.setString(1, id); result =
		 * pstmt.executeUpdate(); } catch (SQLException e) { e.getStackTrace();
		 * } finally { try { if (pstmt != null) pstmt.close(); if (con != null)
		 * con.close(); } catch (SQLException e2) { e2.getStackTrace(); } }
		 * return result;
		 */
	}

	public LogonDataBean getMember(String id) {
		LogonDataBean dto = null;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		dto = logonDao.getMember(id);
		return dto;
		/*Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		LogonDataBean dto = new LogonDataBean();
		try {
			con = dataSource.getConnection();
			String sql = "select * from mvc_member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setName(rs.getString(3));
				dto.setJumin1(rs.getString(4));
				dto.setJumin2(rs.getString(5));
				dto.setTel(rs.getString(6));
				dto.setEmail(rs.getString(7));
				dto.setReg_date(rs.getTimestamp(8));
			}
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.getStackTrace();
			}
		}
		return dto;*/
	}

	public int modifyMember(LogonDataBean dto) {
		int result = 0;
		LogonDao logonDao = this.sqlSession.getMapper(LogonDao.class);
		result = logonDao.modifyMember(dto);
		return result;
		/*Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = dataSource.getConnection();
			String sql = "update mvc_member set passwd=?, email=?, tel=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPasswd());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getTel());
			pstmt.setString(4, dto.getId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return result;*/

	}

}
