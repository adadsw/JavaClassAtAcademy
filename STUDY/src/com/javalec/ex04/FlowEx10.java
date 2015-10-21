package com.javalec.ex04;

public class FlowEx10 {
	public static void main(String[] args) {
		int score = 98;
		char grade = ' ';

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		String mark = "good";
		
		switch (mark){
		case "excellent" :
			grade = 'A';
			break;
		case "good"	:
			grade = 'B';
			break;
		case "very" :
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}
}
