package com.javalec.ex16;

public class _02_OuterClass {
	private String name;
	private int age;
	
	public _02_OuterClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void inner_test() {
		int num = 4;
		final int size = 10;
		
		class Inner_Class {
			private String address;
			
			public Inner_Class(String address) {
				this.address = address;
			}
			public String getInfo() {
				System.out.println("inner_test() : " + num);
				System.out.println("inner_test() : " + size);
				return name + " " + age + " "  +address;
			}
		}
		Inner_Class in = new Inner_Class("서대문구 남가좌동");
		System.out.println(in.getInfo());
	}
	

}
