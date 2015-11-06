package com.javalec.ex10;

public class _07_StringTest {
	public static void main(String[] args) {
		String name = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		if (name == name2) System.out.println("name == name2");
		if (name.equals(name2)) System.out.println("name.equals(name2)");
		if (name3 == name4) System.out.println("name3 == name4");
		if (name3.equals(name4)) System.out.println("name3.equals(name4)");
	}

}
