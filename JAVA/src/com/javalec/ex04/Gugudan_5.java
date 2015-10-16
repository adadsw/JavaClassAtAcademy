package com.javalec.ex04;

public class Gugudan_5 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("*** " + i + "단 ***");
			System.out.println("===========");
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				if (j % 2 == 0)
					continue;
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println("===========");
			System.out.println();

		}
	}

}
