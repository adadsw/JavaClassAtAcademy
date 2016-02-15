package spring.mvc.member.dao;

import java.util.Map;

import spring.mvc.member.dto.LogonDataBean;

public interface LogonDao {
	int insertMember(LogonDataBean dto);

	int check(String id);

	int checkPwd(Map<String, String> map);

	int deleteMember(String id);

	LogonDataBean getMember(String id);

	int modifyMember(LogonDataBean dto);

	

}
