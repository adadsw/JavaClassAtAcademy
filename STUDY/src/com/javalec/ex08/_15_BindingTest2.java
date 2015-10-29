package com.javalec.ex08;

public class _15_BindingTest2 {
	public static void main(String[] args) {
		Parent14 p = new Child15();
		Child15 c = new Child15();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Child15 extends Parent14 {
	
}