package com.javalec.ex05;

public class ArrayEx03_3_1 {
	public static void main(String[] args) {
		int[] score = { 82, 76, 90 };

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
		System.out.println("평균 : " + avg); // 평균 출력
		String grade = "";
		switch ((int) avg / 10) { // A, B, C, D, F 붙이기
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		if (avg % 10 >= 5) { // +, - 붙이는 작업
			grade += "+";
		} else {
			grade += "-";
		}
		System.out.println("grade : " + grade); // 학점 출력

	}
}
