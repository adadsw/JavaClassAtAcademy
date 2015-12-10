package com.javelec.practice;

import java.util.Calendar;
import java.util.Date;

public class TestFormats {
	public static void main(String[] args) {
		
		/*String s = String.format("%,d", 1000000000);
		System.out.println(s);
		
		String s1 = String.format("I have %.2f bugs to fix.", 476578.09876);
		System.out.println(s1);
		
		System.out.println(String.format("%tc", new Date()));
		System.out.println(String.format("%tr", new Date()));
		System.out.println(String.format("%tA, %tB %td", new Date(), new Date(), new Date()));
		
		System.out.println(String.format("%tA, %<tB %<td", new Date()));*/
		
		Calendar c = Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		c.setTimeInMillis(day1);
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
	}
}
