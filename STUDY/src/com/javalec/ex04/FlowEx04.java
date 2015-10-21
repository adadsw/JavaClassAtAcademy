package com.javalec.ex04;

public class FlowEx04 {
	public static void main(String[] args) {
		int score = 45;
		char grade = ' ';
		
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("grade : " + grade);
	}

}
