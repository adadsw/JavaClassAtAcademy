package com.brain.exercise;

public class Ex3_4 {
	public static void main(String[] args) {
		double smallest1 = 4.9e-324;  //double 타입의 가장 미세한 +값
		double smallest2 = -4.9e-324; //double 타입의 가장 미세한 -값
		double result1, result2;
		result1 = smallest1 / 2.0;  //가장 미세한 +값을 2로 나누는 식
		result2 = smallest2 / 2.0;  //가장 미세한 -값을 2로 나누는 식
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}

}
