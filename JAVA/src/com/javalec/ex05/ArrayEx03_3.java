package com.javalec.ex05;

public class ArrayEx03_3 {
	public static void main(String[] args) {
		int[] score = { 82, 76, 90 };

		float sum = (float) score[0] + score[1] + score[2]; // 합계
		float avg = sum / score.length; // 평균
		avg = Math.round(avg * 10) / 10f; // 평균 소수 2째 자리에서 반올림
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
