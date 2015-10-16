package com.javalec.ex04;

public class FlowEx17 {
	public static void main(String[] args) {
		System.out.println("count down.");
		for (int i = 5; i>=0; i--){
			for (int j = 0; j < 1000000000; j++) {}
			System.out.println(i);
		}
		System.out.println("GAME OVER");
	}

}
