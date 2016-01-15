package com.javalec.quiz;

public class Score {

	public void sum(int i, int j, int k) {
		System.out.print("합계 : ");
		int result = i + j + k;
		System.out.println(result);
	}
	
	public void average(int i, int j, int k) {
		System.out.print("평균");
		double result = (i + j + k) / 3.0;
		System.out.println(result);
	}
}
