package com.javelec.practice;

public class For {
	public static void main(String[] args) {
		int a[][] = { {1,2,3}, {4,5,6} };
		for (int[] temp : a) {
			for (int temp1 : temp) {
				System.out.println(temp1);
			}
		}
	}
}
