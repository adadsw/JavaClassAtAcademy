package com.javalec.ex04;

public class Star4 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 9; j++) {
					if (j < 4 - i || j > i + 4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} else if (i >= 5) {
				for (int j = 0; j < 9; j++) {
					if (j > 9 - (i -3) || j < i - 4 ) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}

			System.out.println();

		}

	}
}
