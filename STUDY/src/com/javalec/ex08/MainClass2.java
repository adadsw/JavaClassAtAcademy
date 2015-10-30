package com.javalec.ex08;

public class MainClass2 {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.wordNormal();
		childClass.wordAbstract();
	}
}

abstract class AbstractClass {
	AbstractClass() {
	}

	void wordNormal() {
		System.out.println("일반메서드 wordNormal()입니다.");
	}

	abstract void wordAbstract();
}

class ChildClass extends AbstractClass {
	void wordAbstract() {
		System.out.println("추상메서드의 wordAbstract() 재정의입니다.");
	}
}