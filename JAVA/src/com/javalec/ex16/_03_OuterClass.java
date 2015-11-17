package com.javalec.ex16;

public class _03_OuterClass {
	/*
	 * static 내부클래스 1. 정의 : 내부클래스 내에 static 멤버가 있는 경우에 static 내부 클래스로 정의한다.
	 * 외부클래스의 멤버변수 접근은 불가능하다. 객체생성을 안 했으므로 static에서는 일반변수 접근 불가 2. 구성 class
	 * Outer { ... static class Inner {
	 * 
	 * } }
	 */
	private String name;
	private int age;

	public _03_OuterClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	static class Inner_Class {
		private String address;
		static String name = "김태희";
		static int age = 25;

		Inner_Class(String address) {
			this.address = address;
		}

		public String getInfo() {
			return name + " " + age + " " + address;
		}
	}
}
