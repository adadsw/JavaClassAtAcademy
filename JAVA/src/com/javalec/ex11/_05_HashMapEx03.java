package com.javalec.ex11;
import java.util.*;
public class _05_HashMapEx03 {
	public static void main(String[] args) {
		HashMap<String, Bbs> bbs = new HashMap<String,Bbs>();
		bbs.put("fgr12", new Bbs("PASSWORD", "김씨", "abc@asd.com", "서울 ", "전화번호"));
		getInfo(bbs, "fgr12");

	}
	
	static void getInfo(HashMap<String, Bbs> b, String id) {
		System.out.println("아이디  : " + id);
		System.out.println(b.get(id));
	}
}

class Bbs {
	String passwd;
	String name;
	String email;
	String address;
	String num;
	Bbs(String passwd, String name, String email, String address, String num) {
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.address = address;
		this.num = num;
	}
	public String toString() {
		return "패스워드: " + passwd + 
				"\n이름    : " + name + 
				"\n이메일  : " + email +
				"\n주소    : " + address +
				"\nHP      : " + num;	
	}
}