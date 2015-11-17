package com.javalec.ex16;

public class _03_OuterClass {
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
