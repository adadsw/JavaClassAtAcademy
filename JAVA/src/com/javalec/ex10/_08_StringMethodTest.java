package com.javalec.ex10;

public class _08_StringMethodTest {
	public static void main(String[] args) {
		String s = "abcde";
		String str = "abcdh";
		System.out.println(s.concat("test"));
		System.out.println(s.replace('a', 'c'));
		System.out.println(s.substring(2,4));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.endsWith("cde"));
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.indexOf("a"));
	}

}
