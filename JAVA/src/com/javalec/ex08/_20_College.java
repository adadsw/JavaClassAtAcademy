package com.javalec.ex08;

public class _20_College extends _20_Student {
	private int unit;
	
	public _20_College(String n, int g, int unit) {
		name = n;
		grade = g;
		this.unit = unit;
	}
	public _20_College() {
		this("홍길동", 3, 24);
	}
	@Override
	public String getInfo() {
		return "이름은 " + name + ", 학년은 " + grade + ", 학점은 " + unit;
	}
	public String getSchool() {
		return "ㅁㅈ 대학교";
	}

}
