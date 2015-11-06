package com.javalec.ex10;

public class _17_StringEx9 {
	public static void main(String[] args) {
		String fullName = "Enjoyjava.java";
		int index = fullName.indexOf('.');
		String fileName = fullName.substring(0, index);
		String ext = fullName.substring(index + 1);
		System.out.println(fileName + "." + ext);
	}
}
