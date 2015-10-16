package com.javalec.ex04;

public class Star2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i < 6) { // 별 증가
				for (int j = 1; j < 6 - i; j++) // 빈 칸 4 3 2 1 0
					System.out.print(' ');

				for (int k = 1; k <= 2 * i - 1; k++) { // 별 그리기 1 3 5 7 9
					System.out.print("*");
				}
				System.out.println();

			} else { // 별 감소
				for (int j = 1; j < i - 4; j++) // 빈 칸 1 2 3 4
					System.out.print(' ');

				for (int k = 1; k < 20 - i * 2; k++) { // 별 그리기 7 5 3 1
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
