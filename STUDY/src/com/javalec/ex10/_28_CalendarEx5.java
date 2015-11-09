package com.javalec.ex10;

import java.util.Calendar;

public class _28_CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2005, 0, 31);
		System.out.println(_27_CalendarEx4.toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(_27_CalendarEx4.toString(date));
	}

}
