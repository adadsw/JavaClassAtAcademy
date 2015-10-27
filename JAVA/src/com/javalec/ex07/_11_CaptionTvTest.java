package com.javalec.ex07;

public class _11_CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv11 ctv = new CaptionTv11();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}
}

class Tv11 {
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
class CaptionTv11 extends Tv11 {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

