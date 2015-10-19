package com.javalec.ex05;

public class ArrayEx05_RandomScore {
	public static void main(String[] args) {

		int koreanSum = 0;
		int englishSum = 0;
		int mathSum = 0;
		int sum; // 총점
		float avg; // 평균

		int[][] score = new int[(int) (Math.random() * 100)][3];
		for (int i = 0; i < score.length; i++)
			for (int j = 0; j < score[i].length; j++)
				score[i][j] = (int) (Math.random() * 100);
		System.out.println("번호  국어 영어 수학 총점  평균");
		System.out.println("===============================");

		for (int i = 0; i < score.length; i++) {
			sum = 0;
			koreanSum += score[i][0];
			englishSum += score[i][1];
			mathSum += score[i][2];

			if (i + 1 < 10) {
				System.out.print(" " + (i + 1) + "번");
			} else if (i + 1 < 100) {
				System.out.print(i + 1 + "번");
			}

			for (int j = 0; j < score[i].length; j++) {
				printWthSpc(score[i][j]); // 국 영 수
				sum += score[i][j];
			}
			printWthSpc(sum); // 총점

			avg = (float) sum / score[i].length;
			printWthSpc(avg); // 평균
		}

		System.out.println("===============================");
		System.out.print("합계 ");
		printWthSpc(koreanSum); // 국어 합계
		printWthSpc(englishSum); // 영어 합계
		printWthSpc(mathSum); // 수학 합계
	}

	public static void printWthSpc(int num) {
		if (num >= 1000) {
			System.out.print(" " + num);
		} else if (num >= 100) {
			System.out.print("  " + num);
		} else if (num >= 10) {
			System.out.print("   " + num);
		} else {
			System.out.print("    " + num);
		}
	}

	public static void printWthSpc(float num) {
		if (num == 100) {
			System.out.println(" " + Math.round(num * 10) / 10f);
		} else if (num >= 10) {
			System.out.println("  " + Math.round(num * 10) / 10f);
		} else {
			System.out.println("   " + Math.round(num * 10) / 10f);
		}
	}
}
