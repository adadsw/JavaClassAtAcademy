package com.javalec.ex06;

public class _05_ReturnTest {
	public static void main(String[] args) {
		_05_ReturnTest r = new _05_ReturnTest();

		int result = r.add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 };
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

}
