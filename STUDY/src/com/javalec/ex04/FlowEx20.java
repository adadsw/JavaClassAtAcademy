package com.javalec.ex04;

public class FlowEx20 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (sum + 1 <= 100) {
			sum += ++i;
			System.out.println(i + " : " + sum);
		}
	}

}
