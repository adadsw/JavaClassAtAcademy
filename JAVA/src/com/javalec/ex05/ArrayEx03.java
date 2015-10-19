package com.javalec.ex05;

public class ArrayEx03 {
	public static void main(String[] args) {
		String[] celebrity = { "김태희", "비", "장동건", "고소영"};
		for (int i = 0; i < celebrity.length; i++)
			System.out.println(celebrity[i]);
		System.out.println();
		
		String[] standard;
		standard = new String[4];
		standard[0] = "김태희";
		standard[1] = "비";
		standard[2] = "장동건";
		standard[3] = "고소영";
		for (int i = 0; i < standard.length; i++)
			System.out.println(standard[i]);
	}
}
