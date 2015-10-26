package com.javalec.ex06;

public class ComputeScore2 {
	public static void main(String[] args) {
		Score2 score = new Score2(98, 84, 75);
		
		int result = score.getTotal(score.kor, score.eng, score.mat);
		
		System.out.println("합계 : " + result);
		
		float avg = score.getAvg(result);
		System.out.println("평균 : " + avg);
		
		String grade = score.getGrade(avg);
		System.out.println("학점 : " + grade);
	}

}
