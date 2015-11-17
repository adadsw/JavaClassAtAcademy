package com.javalec.ex15;

public class _01_VarAragsEx_1 {
	public static void main(String[] args) {
		
		Varargs1 varargs = new Varargs1();
		varargs.test("히", "하", "후", "헤", "호");
		varargs.test2(10, 20, 30, 40, 50);
	}
}

class Varargs1 {
	public void test(String ...s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	public void test2(int ...is) {
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
	}
}
