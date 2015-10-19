package com.javalec.ex05;

public class ArrayEx03_4 {
	public static void main(String[] args) {
		int[] score = new int[3];
		score[0] = 82;
		score[1] = 76;
		score[2] = 21;

		float sum = score[0] + score[1] + score[2];
		float avg = sum / 3;
		avg = Math.round(avg * 100) / 100f;
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

		if (avg % 10 >= 5 && grade != "F") {
			grade += "+";
		} else if (avg % 10 < 5 && grade != "F") {
			grade += "-";
		}
		System.out.println("학점 : " + grade);
	}
}
