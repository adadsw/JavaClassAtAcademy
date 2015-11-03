package com.javalec.ex08;

public class _35_InterfaceTest2 {
	public static void main(String[] args) {
		A24 a = new A24();
		a.autoPlay(new B24());
		System.out.println();
		a.autoPlay(new C24());
	}
}

class A24 {
	void autoPlay(I24 i) {
		i.play();
		i.sing();
		i.dance();
	}
}

interface I24 {
	public abstract void play();

	public abstract void sing();

	public abstract void dance();
}

class B24 implements I24 {
	public void play() {
		System.out.println("play in B class");
	}

	@Override
	public void sing() {
		System.out.println("sing in B class");
	}

	@Override
	public void dance() {
		System.out.println("dance in B class");

	}
}

class C24 implements I24 {
	public void play() {
		System.out.println("play in C class");
	}

	@Override
	public void sing() {
		System.out.println("sing in C class");
	}

	@Override
	public void dance() {
		System.out.println("dance in C class");
	}
}