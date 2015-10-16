package com.javalec.ex04;

public class FlowEx09_fixed {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 10) + 1;
		String msg = "";
		score *= 100;
		msg = "당신의 점수는 " + score + "이고, 상품은 ";

		switch (score) {
			case 1000:
				msg += "자전거";
				break;
			case 900:
				msg += "TV";
				break;
			case 800:
				msg += "노트북";
				break;
			case 700:
				msg += "볼펜";
				break;

		}
		if (score >= 700) {
			System.out.println(msg + "입니다.");
		} else {
			System.out.println(msg + "없습니다.");
		}
	}
}
