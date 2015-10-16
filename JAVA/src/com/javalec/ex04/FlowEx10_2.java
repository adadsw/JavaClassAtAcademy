package com.javalec.ex04;

import java.util.Scanner;

public class FlowEx10_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		switch (i) {
		case 0:
			System.out.println("입력값은 0입니다.");
			break;
		default :
			switch (i % 2) {
			case 1:
				System.out.println("입력값은 " + i + "이고, 홀수입니다.");
				break;
			case 0:
				System.out.println("입력값은 " + i + "이고, 짝수입니다.");
			}
		}
	}
}
