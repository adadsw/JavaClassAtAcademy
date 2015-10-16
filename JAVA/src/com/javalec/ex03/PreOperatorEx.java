package com.javalec.ex03;

public class PreOperatorEx {

	public static void main(String[] args) {

		int i = 4 + 2;
		System.out.println("i : " + i);

		int n = i + 1;
		System.out.println("n : " + n);

		int p = 5;
		System.out.println("p : " + p);
		
		int p2;

		p2 = p + 1;
		System.out.println("p2 : " + p2);

		p2 = ++p;
		System.out.println("++p : " + p2);

		p2 = p++;
		System.out.println("p++ : " + p2);

		int j = 4 - 2;
		System.out.println("j : " + j);

		int k = 4 * 2;
		System.out.println("k : " + k);

		int l = 4 / 2;
		System.out.println("l : " + l);

		int m = 4 % 2;
		System.out.println("m : " + m);

	}

}
