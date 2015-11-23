package com.javalec.ex16;

public class Father {
	private String name;
	public Father(String name) {
		this.name = name;
	}
}

class Child extends Father {
	public Child(String name) {
		super(name);
	}
}
