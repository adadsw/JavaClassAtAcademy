package com.javalec.ex10;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 24);
		Student s2 = new Student("홍길동", 24);
		
		System.out.println(s);
		System.out.println(s.toString());
		
		if (s == s2) {
			System.out.println("s == s2 은 참");
		} else {
			System.out.println("s == s2 은 거짓");
		}
		
		if (s.equals(s2)) {
			System.out.println("s.equals(s2) 은 참");
		} else {
			System.out.println("s.equlas(s2) 은 거짓");
		}
	}
}


class Student {
	private String name;
	private int age;
	
	public Student(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return name + " " + age;
	}
}