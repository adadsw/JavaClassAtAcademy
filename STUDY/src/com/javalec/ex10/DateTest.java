package com.javalec.ex10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd");
		
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf2.format(new Date()));
		System.out.println(sdf3.format(new Date()));
		System.out.println(sdf4.format(new Date()));
		System.out.println(sdf5.format(new Date()));
	}

}
