package com.javalec.ex04;

public class FlowEx09_1 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 100) + 1;
		String msg = "당신의 점수는 " + score + "이고, 학점은 ";
		String grade = " ";
		if (score >= 90) {
			grade = "A";
			if (score >= 95)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade += "+";
			else
				grade += "-";
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65)
				grade += "+";
			else
				grade += "-";
		} else {
			grade = "F";
		}
		msg += grade + "입니다.";
		System.out.println(msg);
	}

}
