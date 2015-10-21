package com.javalec.ex04;

public class FlowEx03 {
	public static void main(String[] args) {
		int score = 45;
		char grade = ' ';
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println("grade : " + grade);
	}

}
