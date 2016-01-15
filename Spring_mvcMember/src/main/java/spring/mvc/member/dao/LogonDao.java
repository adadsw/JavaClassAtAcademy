package spring.mvc.member.dao;

import spring.mvc.member.dto.LogonDataBean;

public interface LogonDao {
	int insertMember(LogonDataBean dto);

	int check(String id);

	int check(String id, String passwd);

	int deleteMember(String id);

	LogonDataBean getMember(String id);

	int modifyMember(LogonDataBean dto);

}
