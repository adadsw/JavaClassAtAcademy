package com.javalec.ex16;

public class Outer_Class {
	/*
	 * 내부클래스(Inner class)
	 * 1. 정의 : 특정 클래스 내부에 또 다른 클래스가 정의되는 것을 말한다.
	 * 2. 용도 : 서로 독립적인 관계가 아닌 하나의 멤버처럼 사용될 수 있는 경우에 사용. 
	 * 			 대표적으로 GUI와 GUI 이벤트를 구현할 때 사용될 수 있다.
	 * 3. 특징 :1) 내부클래스는 외부클래스의 모든 멤버를 자신의 멤버처럼 사용할 수 있다.
	 * 			2) static 내부 클래스를 제외한 다른 모든 내부클래스는 항상 외부 클래스를 
	 * 			   이용하여 접근할 수 있다. 	 
	 * 			3) 종류
	 * 			member : 외부클래스의 멤버변수나 멤버메서드와 같이 내부클래스가 정의된 경우
	 * 					 내부클래스를 생성하려면 먼저 외부클래스를 생성해야 한다.
	 * 			local : 외부클래스의 특정 메서드 내에서 내부클래스가 정의된 경우
	 * 			static : 내부클래스가 static으로 정의된 경우
	 * 			anonymous : 내부클래스가 이름 없이 정의된 경우
	 */
	/*
	 * 1. 멤버클래스 
	 * 	  외부클래스의 멤버처럼 정의된 클래스
	 * 	  내부클래스를 생성하려면 먼저 외부클래스를 생성해야 한다.
	 * 	  구성 class Outer {
	 * 				..
	 * 				class Inner {
	 * 				}
	 * 		   }
	 */
	
	private String name;
	private int age;
	
	public Outer_Class(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public class Inner_class {
		private String address;
		public Inner_class(String address) {
			this.address = address;
		}
		public String getInfo() {
			return name + " " + age + " " + address;
		}
	}
}
