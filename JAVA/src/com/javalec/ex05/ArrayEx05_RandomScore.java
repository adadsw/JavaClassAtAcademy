package com.javalec.ex05;

public class ArrayEx05_RandomScore {
	public static void main(String[] args) {

		int sum; // 총점
		float avg; // 평균

		int[][] score = new int[(int)(Math.random() * 100)][3];
		for (int i = 0; i < score.length; i++)
			for (int j = 0; j < score[i].length; j++)
				score[i][j] = (int)(Math.random() * 100);
		System.out.println("번호  국어 영어 수학 총점  평균");
		System.out.println("===============================");

		for (int i = 0; i <= score.length; i++) {
			//================ 합계 산출=====================
			if (i == score.length) {
				System.out.println("===============================");
				System.out.print("합계 ");
				for (int k = 0; k < 3; k++) {
					sum = 0;
					for (int l = 0; l < score.length; l++) {
						sum += score[l][k];
					}
					putNum(sum); //합계 print
				}
				System.out.println();

				//============ 번호부터 평균까지 ============ 문서의 시작
			} else {
				if (i + 1 < 10) {
					System.out.print(i + 1 + "번  ");
				} else if (i + 1 < 100) {
					System.out.print(i + 1 + "번 ");
				} else {
					System.out.print(i + 1 + "번");
				}
				sum = 0;
				for (int j = 0; j < score[i].length; j++) {
					putNum(score[i][j]); // 국 영 수 점수 찍어냄
					sum += score[i][j]; // 각 번호의 총점 합
				}
				putNum(sum); //총점을 print

				avg = (float) sum / score[i].length; // 평균 산출
				putNum(avg); // 평균 print
			}
		}
	}

	public static void putNum(int num) { // ======국영수총점 용 함수=====
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
	
	public static void putNum(float num) { //===== 평균 용 함수=======
		if (num == 100) {
			System.out.println(" " + Math.round(num * 10) / 10f);
		} else if (num >= 10) {
			System.out.println("  " + Math.round(num * 10) / 10f);
		} else {
			System.out.println("   " + Math.round(num * 10) / 10f);
		}
	}
}
