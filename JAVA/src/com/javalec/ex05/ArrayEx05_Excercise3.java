package com.javalec.ex05;

public class ArrayEx05_Excercise3 {
	public static void main(String[] args) {
		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============================");
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(i + 1 + " ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				sum += score[i][j];
			}
			avg = (float) sum / score[i].length;
			System.out.print(sum + " ");
			System.out.println(avg + " ");
		}
		System.out.println("=============================");
		System.out.print("합계 ");
		System.out.print(koreanTotal + " ");
		System.out.print(englishTotal + " ");
		System.out.print(mathTotal + " ");
	}
}
