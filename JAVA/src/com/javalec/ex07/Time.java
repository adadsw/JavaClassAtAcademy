package com.javalec.ex07;

public class Time {

	private int kor = 100;
	private int eng;
	private int mat;
	
	public Time() {}
	
	public Time(int kor) {
		this.kor = kor;
		System.out.println("kor : " + kor);
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return mat;
	}
	public void setMath(int mat) {
		this.mat = mat;
	}
	
	
}
