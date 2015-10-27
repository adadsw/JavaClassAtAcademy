package com.javalec.ex07;

public class _09_TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time(90);
		
		t.setKor(80);
		System.out.println(t.getKor());
		
		t.setEng(70);
		System.out.println(t.getEng());
		
		t.setMath(60);
		System.out.println(t.getMath());
	}

}
