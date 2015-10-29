package com.brain.ch9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class After100Days {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DATE, 100);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year + "년" + month + "월" + date + "일");

		
	}

}
//100일 후 날짜
