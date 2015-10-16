package com.javalec.ex03;

public class OperatorEx15 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		// float shortPi = (pi*1000);
		// float shortPi = (pi*1000 / 1000f;)
		float shortPi = (int) (pi * 1000);
		System.out.println(shortPi);
	}

}
