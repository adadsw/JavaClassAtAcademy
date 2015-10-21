package com.javalec.ex04;

public class FlowEx06 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 10) + 1;
		switch (score * 100) {
		case 100:
			System.out.println("score 100 : bicycle.");
			break;
		case 200:
			System.out.println("score 200 : TV.");
			break;
		case 300:
			System.out.println("score 300 : notebook.");
			break;
		case 400:
			System.out.println("score 400 : car.");
			break;
		default:
			System.out.println("no price.");
		}
	}

}
