package com.javalec.ex04;

public class FlowEx11_1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum + i + " = " + sum + " + " + i + " 입니다."); 
			sum += i;
		}
	}
}
