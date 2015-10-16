package com.javalec.ex03;

public class OperatorEx08 {

	public static void main(String[] args) {

		int a = 1000000;
		int b = 2000000;
		int c1 = a * b; //틀린 값
		long c2 = a * b; //틀린 값
		long c3 = (long) a * b; //큰 타입 형변환. a가 long이 되고 *연산으로 인해 b가 long으로 변환된 후 연산.
		long c4 = (long) (a * b); //틀린 값
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}
}
