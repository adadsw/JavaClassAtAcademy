package com.javalec.ex07;

public class _14_BindingTest {
	public static void main(String[] args) {
		Parent14 p = new Child14();
		Child14 c = new Child14();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent14 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child14 extends Parent14 {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}
