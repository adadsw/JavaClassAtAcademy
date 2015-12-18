package mvc.member.dto;

import java.sql.Timestamp;

public class LogonDataBean {
	private String id;
	private String passwd;
	private String name;
	private String jumin1;
	private String jomin2;
	private String tel;
	private String email;
	private Timestamp regdate;
	
	public LogonDataBean(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin1() {
		return jumin1;
	}

	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}

	public String getJomin2() {
		return jomin2;
	}

	public void setJomin2(String jomin2) {
		this.jomin2 = jomin2;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}
