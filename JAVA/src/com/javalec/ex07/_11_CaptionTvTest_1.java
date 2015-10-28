package com.javalec.ex07;

public class _11_CaptionTvTest_1 {
	public static void main(String[] args) {

		// 부모 클래스 변수에 자식 객체를 담음.
		Tv11_1 ctv = new CaptionTv11_1();
		CaptionTv11_1 ctv_1 = (CaptionTv11_1)ctv;
		ctv_1.channel = 10;
		ctv_1.channelup();
		System.out.println(ctv.channel);
		// 부모 클래스에 없는 displayCaption 메서드와 caption 변수를 호출할 수 없다.
		ctv_1.displayCaption("Hello, World");
		ctv_1.caption = true;
		ctv_1.displayCaption("Hello, World");

		// 자식 클래스 변수에 부모 클래스 객체를 담을 수 없다.
		// CaptionTv11_1 ctv1 = new Tv11_1();

	}

}

class Tv11_1 {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelup() {
		++channel;
	}

	void channeldown() {
		--channel;
	}
}

class CaptionTv11_1 extends Tv11_1 {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}