package com.javalec.ex05;

public class ArrayEx05 {
	public static void main(String[] args) {

		int sum; // 총점
		float avg; // 평균

		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 },
				};
		System.out.println("번호 국어 영어 수학 총점   평균");
		System.out.println("===============================");

		for (int i = 0; i <= score.length; i++) {
			if (i == score.length) { //합계 산출 로직
				System.out.println("===============================");
				System.out.print("합계");
				
				for (int k = 0; k < score[k].length; k++) {
					sum = 0;
					for (int l = 0; l < score.length; l++) {
						sum += score[l][k];
					}
					if (sum / 10 > 9) // 합계 열 빈칸 조절
						System.out.print("  " + sum);
					else
						System.out.print("   " + sum);
				}
									//합계 산출 끗
									//처음부터 합계 전 까지 시작
			} else {
				System.out.print(i + 1 + "번  ");
				sum = 0;
				for (int j = 0; j < score[i].length; j++) {
					if (score[i][j] == 100) { // 국영수 점수 열 빈칸 조절
						System.out.print(" " + score[i][j] + " ");
					} else {
						System.out.print("  " + score[i][j] + " ");
					}
					sum += score[i][j]; // 총점 산출
				}

				if (sum / 10 > 9) // 총점 열 빈칸 조절
					System.out.print(" " + sum + " ");
				else
					System.out.print("  " + sum + " ");

				avg = (float)sum / score[i].length; // 평균 산출
				if (avg / 10 > 9) // 평균 열 빈칸 조절
					System.out.println(" " + avg);
				else
					System.out.println("  " + avg);
			}
			
		}
	}
}
