package com.javalec.ex08;

public class _08_FinalCardTest {
	public static void main(String[] args) {
		Card8 c = new Card8("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}

class Card8 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card8(String kind, int num) {
		this.KIND = kind;
		this.NUMBER = num;
	}

	Card8() {
		this("HEART", 1);
	}

	public String toString() {
		return "" + KIND + " " + NUMBER;
	}
}
