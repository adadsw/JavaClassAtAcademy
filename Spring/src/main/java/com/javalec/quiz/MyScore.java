package com.javalec.quiz;

public class MyScore {

	private int korean;
	private int english;
	private int math;
	Score score;
	
	public void sum() {
		score.sum(korean, english, math);
	}
	public void average() {
		score.average(korean, english, math);
	}
	
	public void setScore(Score score) {
		this.score = score;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
