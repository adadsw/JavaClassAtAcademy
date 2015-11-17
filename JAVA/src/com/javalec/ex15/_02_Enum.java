package com.javalec.ex15;

public class _02_Enum {
	public static void main(String[] args) {
		/*
		 * enum : 열거형
		 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
		 * 2. 방법 : 접근지정자 enum 열거형명{상수값1, 상수값2, 상수값3..}
		 * 3. 용도 : 제한된 상수값만을 사용하고자 할 때
		 * 4. 특징 : swich(변수)에서 변수타입으로 enum을 사용할 수 있다.
		 * 			 ordinal() 메서드를 사용하여 순서값을 얻어올 수 있다.
		 */
		
		System.out.println(_02_Day.SUN);
		System.out.println(_02_Day.MON);
		System.out.println(_02_Day.TUE);
		System.out.println(_02_Day.WED);
		System.out.println(_02_Day.THU);
		System.out.println(_02_Day.FRI);
		System.out.println(_02_Day.SAT);
		
		System.out.println(_02_Day.SUN.ordinal());
		System.out.println(_02_Day.MON.ordinal());
		System.out.println(_02_Day.TUE.ordinal());
		System.out.println(_02_Day.WED.ordinal());
		System.out.println(_02_Day.THU.ordinal());
		System.out.println(_02_Day.FRI.ordinal());
		System.out.println(_02_Day.SAT.ordinal());

		switch (_02_Day.SUN) {
		case SUN :
			System.out.println("일요일");
			break;
		}
	}
}
