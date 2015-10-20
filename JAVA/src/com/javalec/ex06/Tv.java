package com.javalec.ex06;

public class Tv {

	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	int volume;
	
	// Tv의 기능(메서드)
	void power() {power = !power;}
	void channelup() {channel++;}
	void channeldown() {channel--;}
	void volumeup() {volume++;}
	void volumedown() {volume--;}
}
