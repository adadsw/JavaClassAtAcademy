package com.javalec.ex07;

public class _04_College extends _04_Student{
	
	private int unit;
	
	public _04_College() {}
	
	_04_College(String n, int g, int u) {
		name = n;
		grade = g;
		unit = u;
	}
	
	public int getUnit() {
		return unit;
	}
	
	@Override
	public String getInfo() {
		return "이름 : " + name + ", 학년 : " + grade + ", 학점 : " + unit;
		}

}
