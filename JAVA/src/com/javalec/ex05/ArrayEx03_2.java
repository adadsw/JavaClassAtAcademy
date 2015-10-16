package com.javalec.ex05;

public class ArrayEx03_2 {
	public static void main(String[] args) {
		int[] score = { 82, 76, 90};

		float sum = (float) score[0] + score[1] + score[2]; // 합계
		float avg = sum / score.length; // 평균

		/*----------평균의 소수점 2번째 자리에서 반올림--------*/
		float temp1 = avg * 100; // 82.66664 -> 8266.664
		int temp2 = (int) temp1 % 10; // 8266.664 -> 6.6640625

		if (temp2 > 4) { // 올림의 경우
			avg = (float) (int) (temp1 + 1) / 100;
		} else { // 내림의 경우
			avg = (float) (int) (avg * 100) / 100;
		}
		/*------------------반올림 작업 끝-------------------*/
		System.out.println("평균 : " + avg);

		String grade = "";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if (avg % 10 >= 5) {
			grade += "+";
		} else {
			grade += "-";
		}
		System.out.println(grade);

	}
}
