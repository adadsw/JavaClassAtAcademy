package spring.mvc.bms.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDBBean implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public int check(Map<String, String> map) {
		int result = 0;
		UserDao dao = this.sqlSession.getMapper(UserDao.class);
		result = dao.check(map);
		if (result == 0) {
			result = -1;
		}
		return result;
	}
}
