package com.javalec.ex15;

public class _02_Enum {
	public static void main(String[] args) {
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
