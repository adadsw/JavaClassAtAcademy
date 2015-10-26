package com.javalec.ex07;

public class _02_College extends _02_Student {
	
	private int unit;
	
	public _02_College() {
		
	}
	
	public _02_College(String n, int g, int u) {
		super();
		System.out.println("College 생성자 호출");
		name = n;
		grade = g;
		unit = u;
	}
	
	public int getUnit() {
		return unit;
	}

}
