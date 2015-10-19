package com.javalec.ex05;

public class ArrayEx05_Excercise {
	public static void main(String[] args) {
		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============================");
		
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			float avg = 0;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(i + 1 + " "); 					// 번호 출력
			
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "   ");		// 국영수 출력
				sum += score[i][j];
			}
			
			avg = sum / score[i].length;
			
			System.out.print(sum + "   " + avg);			// 총점 평균 출력
			System.out.println();
		}
		System.out.println("=============================="); // 합계 출력
		System.out.println("합계 " + koreanTotal + " " + englishTotal + " " + mathTotal );
		
	}
}
