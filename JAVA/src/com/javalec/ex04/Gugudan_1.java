package com.javalec.ex04;

public class Gugudan_1 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			System.out.println("===========");
			System.out.println();
			for (int j = 1; j <= 9; j++)
				System.out.println(i + " X " + j + " = " + i * j);
			System.out.println("===========");
			System.out.println();

		}
	}

}
