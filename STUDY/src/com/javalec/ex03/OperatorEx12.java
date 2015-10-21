package com.javalec.ex03;

public class OperatorEx12 {

	public static void main(String[] args) {
				
		char c1 = 'a';
		char c2 = c1;
		int i = c1 + 1;
		System.out.println("i = " + i);
		
		char k = 'a' + 1;
		int l = 'a' + 1;
		System.out.println("k = " + k);
		System.out.println("l = " + l);
		
		System.out.println("c2 = " + c2);
		
		c2++;
		System.out.println("c2 = " + c2);
		
		c2++;
		System.out.println("c2 = " + c2);
		
		char c4 = 'a';
		char c5 = 'a' + 1;
		System.out.println(c4);
		System.out.println(c5);
		
		int m = 'B' - 'A';
		int n = '2' - '0';
		System.out.println(m);
		System.out.println(n);
		
//		boolean truth = (boolean)1;
	}
}
