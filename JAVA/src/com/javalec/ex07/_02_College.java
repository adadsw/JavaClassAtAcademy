package com.javalec.ex07;

public class _02_College extends _02_Student {

	private int unit;

	public _02_College() {
	}

	public _02_College(String name, int grade, int unit) {
		super();
		System.out.println("College 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.unit = unit;
	}

	public int getUnit() {
		return unit;
	}

}
