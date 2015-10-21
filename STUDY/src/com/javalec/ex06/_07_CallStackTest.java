package com.javalec.ex06;

public class _07_CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
