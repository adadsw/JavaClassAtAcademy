package com.javalec.ex03;

public class Operatorex16 {
	public static void main(String[] args) {

		float pi = 3.141592f;
//		float shortPi = pi * 1000;
//		System.out.println(shortPi);
//		shortPi = Math.round(pi * 1000);
//		System.out.println(shortPi);
		float shortPi = Math.round(pi * 1000) / 1000f;
		System.out.println(shortPi);
	}
}
