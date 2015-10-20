package com.javalec.ex04;

import java.util.Scanner;

public class Star5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		
		if (height % 2 == 0) {
			System.out.println("홀수를 입력해주십시오.");
			return;
		}
		/*int height = 7;*/
		
		int mid = (height / 2) + 1;
		int space = height / 2;
		boolean m = true;
		
		System.out.println("입력값 :" + height + "\nmid : " + mid + "\nspace :" + space);
		
		for (int i = 0; i < height; i++) {
			if (m) {
				for (int j = 0; j < space; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				space -= 1;
				System.out.println();
				if (space == 0) {
					m = !m;
				}
			} else {
				for (int j = 0; j < space; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (height - 1) * 2 - (2 * i - 1); j++) {
					System.out.print("*");
				}
				space += 1;
				System.out.println();
				
			}
		}
	}
}
