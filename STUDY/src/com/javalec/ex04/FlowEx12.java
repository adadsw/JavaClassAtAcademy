package com.javalec.ex04;

public class FlowEx12 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i ++) {
			sum += i;
			System.out.println(i - 1 + "까지의 합: " + sum);
		}
	}

}
