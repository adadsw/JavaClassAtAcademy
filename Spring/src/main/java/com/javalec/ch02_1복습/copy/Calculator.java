package com.javalec.ch02_1복습.copy;

public class Calculator {
	public void addtion(int i, int j) {
		System.out.println("addition()");
		int result = i + j;
		System.out.println(i + " + " + j + " = " + result);
	}
	public void substraction(int i, int j) {
		System.out.println("substraction()");
		int result = i - j;
		System.out.println(i + " - " + j + " = " + result);
	}
	public void multiplation(int i, int j) {
		System.out.println("multiplation()");
		int result = i * j;
		System.out.println(i + " * " + j + " = " + result);
	}
	public void division(int i, int j) {
		System.out.println("division()");
		int result = i / j;
		System.out.println(i + " / " + j + " = " + result);
	}
}
