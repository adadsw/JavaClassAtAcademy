package com.javalec.ex04;

public class FlowEx22 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (true) {
			if(sum > 10) break;
			sum += i;
			i++;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
