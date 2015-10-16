package com.javalec.ex04;

import java.util.Scanner;

public class FlowEx10_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		switch (i % 2) {
		case 1:
			System.out.println("입력값은 " + i + "이고, 홀수입니다.");
			break;
		case 0:
			if (i == 0) {
				System.out.println("입력값은 0입니다.");
			} else {
				System.out.println("입력값은 " + i + "이고, 짝수입니다.");
			}
		}
	}
}
