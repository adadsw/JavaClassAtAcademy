package com.brain.exercise;

public class TryExample {
	public static void main(String[] args) {
		int divisor[] = { 5, 4, 3, 2, 1, 0 };
		for (int cnt = 0; cnt <10; cnt ++) {
			try {
				int share = 100 / divisor[cnt];
				System.out.println(share + " : 나눈 값 " + divisor[cnt]);
			}
			catch (java.lang.ArithmeticException e) {
				System.out.println("잘못된 연산입니다.");
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못된 인덱스입니다.");
			}
		}
		System.out.println("Done.");
	}

}
