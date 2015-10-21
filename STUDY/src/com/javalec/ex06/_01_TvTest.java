package com.javalec.ex06;

public class _01_TvTest {
	public static void main(String[] args) {
		
		//클래스는 디자인이며, 이 디자인을 바탕으로 만들어진 메모리 공간의 객체이다.
		Tv t = new Tv();
		t.channel = 7;
		t.channeldown();
		System.out.println("channel : " + t.channel);
		t.channelup();
		System.out.println("channel : " + t.channel);
		
		Tv t2 = new Tv();
		t2.channel = 10;
		System.out.println("t2.channel : " + t2.channel);
		t2.channelup();
		System.out.println("t2.channel : " + t2.channel);
		t2.channeldown();
		System.out.println("t2.channel : " + t2.channel);
		
		Tv t3 = new Tv();
		t3.color = "red";
		System.out.println("t3.color : " + t3.color);
		System.out.println("t3.power : " + t3.power);
		t3.power();
		System.out.println("t3.power : " + t3.power);
		t3.volume = 10;
		System.out.println("t3.volume : " + t3.volume);
		t3.volumeup();
		System.out.println("t3.volume : " + t3.volume);
		t3.volumedown();
		System.out.println("t3.volume : " + t3.volume);
	}
}
