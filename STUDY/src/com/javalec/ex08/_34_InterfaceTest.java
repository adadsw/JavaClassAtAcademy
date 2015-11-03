package com.javalec.ex08;

public class _34_InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
		a.methodA_1(new C());
	}

}

interface I {
	public void methodB();
}

class A {
	public void methodA(I i) {
		i.methodB();
	}
	
	public void methodA_1(C c) {
		c.methodB();
	}
}

class B implements I {
	public void methodB() {
		System.out.println("methodB()");
	}
}

class C {
	public void methodB() {
		System.out.println("MethodB() in class C");
	}
}