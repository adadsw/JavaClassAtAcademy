package com.javalec.ex08;

public class _36_InterfaceTest3 {
	public static void main(String[] args) {
		A25 a = new A25();
		a.methodA();
	}
}

class A25 {
	void methodA() {
		I25 i = InstanceManager.getInstance();
		i.methodB();
		I25 i2 = InstanceManager.getInstance2();
		i2.methodB();
	}
}

interface I25 {
	public abstract void methodB();
}

class B25 implements I25 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class C25 implements I25 {
	public void methodB() {
		System.out.println("methodB in C class");
	}
}

class InstanceManager {
	public static I25 getInstance() {
		return new B25();
	}

	public static I25 getInstance2() {
		return new C25();
	}
}