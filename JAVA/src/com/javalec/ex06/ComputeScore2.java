// 퀴즈
package com.javalec.ex06;

import java.util.Scanner;

public class ComputeScore2 {
	public static void main(String[] args) {
		int koreanTot = 0;
		int englishTot = 0;
		int mathTot = 0;
		
		System.out.println("학생 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int stuNum = scanner.nextInt();
		
		System.out.println("학생 수 : " + stuNum);
		Score[] student5 = new Score[stuNum];
		for (int i = 0; i < stuNum; i++) {
			student5[i] = new Score();
		}

		System.out.println("학생의 성적을 입력해주세요.");
		for (int i = 0; i < stuNum; i++) {

			System.out.println(i + 1 + "번 국어 : ");
			student5[i].koreanScore = scanner.nextInt();
			System.out.println(i + 1 + "영어 : ");
			student5[i].englishScore = scanner.nextInt();
			System.out.println(i + 1 + "수학 : ");
			student5[i].mathScore = scanner.nextInt();
		}
		
		System.out.println("번호  국어 영어 수학 총점 평균 학점");
		System.out.println("===================================");
		for(int i = 0; i < stuNum; i++) {
			student5[i].getTot();
			student5[i].getAvg();
			student5[i].getGrade();
			System.out.print("  "+ (i + 1) + " ");
			printWthSpc(student5[i].koreanScore);
			printWthSpc(student5[i].englishScore);
			printWthSpc(student5[i].mathScore);
			printWthSpc(student5[i].sum);
			printWthSpc(student5[i].avg);
			printWthSpc(student5[i].grade);
			System.out.println();
			koreanTot += student5[i].koreanScore;
			englishTot += student5[i].englishScore;
			mathTot += student5[i].mathScore;
		}
		System.out.println("===================================");
		System.out.print("합계");
		printWthSpc(koreanTot);
		printWthSpc(englishTot);
		printWthSpc(mathTot);
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
			System.out.print(" " + Math.round(num * 10) / 10f);
		} else if (num >= 10) {
			System.out.print("  " + Math.round(num * 10) / 10f);
		} else {
			System.out.print("   " + Math.round(num * 10) / 10f);
		}
	}
	public static void printWthSpc(String str) {
		System.out.print("  " + str);
	}
}
