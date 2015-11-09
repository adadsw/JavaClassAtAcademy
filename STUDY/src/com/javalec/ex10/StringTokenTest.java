package com.javalec.ex10;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String date = "2007/04/20";
		StringTokenizer st = new StringTokenizer(date, "/");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String date2 = "aaa bbb ccc";
		StringTokenizer st2 = new StringTokenizer(date2);
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		String IDNumber = "900827-1234567";
		StringTokenizer st3 = new StringTokenizer(IDNumber, "-");
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		String birth = "1990/08/27";
		StringTokenizer st4 = new StringTokenizer(birth, "/");
		
		while(st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());			
		}
	}

}
