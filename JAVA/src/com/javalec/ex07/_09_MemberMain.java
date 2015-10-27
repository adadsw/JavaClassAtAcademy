package com.javalec.ex07;

public class _09_MemberMain {
	
	/* set, get을 이용해서 출력하세요...
	 * id : admin
	 * pwd : admin1234
	 * name : 본인이름
	 * age : 본인나이
	 * email : test@naver.com 
	 */
	
	public static void main(String[] args) {
		_09_Member a = new _09_Member();
	
		a.setId("admin");
		a.setPwd("admin1234");
		a.setName("SeungHyeon");
		a.setAge(26);
		a.setEmail("test@naver.com");
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getEmail());
	
	}
}
