// 퀴즈
package com.javalec.ex06;

public class ComputeScore {
	public static void main(String[] args) {
		Score student = new Score();
		student.koreanScore = 98;
		student.englishScore = 84;
		student.mathScore = 75;
		System.out.println("국어 : " + student.koreanScore);
		System.out.println("영어 : " + student.englishScore);
		System.out.println("수학 : " + student.mathScore);
		student.getTot();
		System.out.println("총점 : " + student.sum);
		student.getAvg();
		System.out.println("평균 : " + student.avg);
		student.getGrade();
		System.out.println("학점 : " + student.grade);
	}
}
