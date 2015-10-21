package com.javalec.ex04;

public class FlowEx02 {
	public static void main(String[] args) {
		int visitCount = 5;
		if (visitCount < 1) {
			System.out.println("first visit.");
		} else {
			System.out.println("revisit.");
		}
		System.out.println("visiting count : " + visitCount);
	}

}
