package com.javalec.ex16;

public class Inherit {
	public static void main(String[] args) {
		Super var = new Sub();
		var.add();
		System.out.println(var.a);
		
		Sub var1 = new Sub();
		var1.add();
		System.out.println(var1.a);
	}
}

class Super { 
	int a;
	
	public Super() { a = 1; }

	public void add() { a += 10; }
}

class Sub extends Super {
	int a;

	public Sub() { a = 5; }

	public void add() { this.a += 10; }
}
