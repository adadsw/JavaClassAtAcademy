package com.javalec.ex16;

public class Outer_Class {
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
	public class Inner_Class {
		private String address;
		public Inner_Class(String address) {
			this.address = address;
		}
		public String getInfo() {
			return name + " " + age + " " + address;
		}
	}
}
