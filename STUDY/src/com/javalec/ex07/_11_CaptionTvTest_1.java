package com.javalec.ex07;

public class _11_CaptionTvTest_1 {
	public static void main(String[] args) {
		
		Tv11_1 ctv = new CaptionTv11_1();
		CaptionTv11_1 ctv_1 = (CaptionTv11_1)ctv;
		ctv_1.channel = 10;
		ctv_1.channelUp();
		System.out.println(ctv.channel);
		ctv_1.displayCaption("Hello, World");
		ctv_1.caption = true;
		ctv_1.displayCaption("Hello, World");
	}
}

class Tv11_1 {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv11_1 extends Tv11_1 {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}