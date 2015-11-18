package com.javalec.ex10;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 s = new Student1("홍길동", 24);
		Student1 s2 = new Student1("홍길동", 24);
		
		if (s == s2) {
			System.out.println("s == s2 은 참");
		} else {
			System.out.println("s == s2 은 거짓");
		}
		
		if (s.equals(s2)) {
			System.out.println("s.equals(s2) 은 참");
		} else {
			System.out.println("s.equals(s2) 은 거짓");
		}
	}

}

class Student1 {
	
	private String name;
	private int age;
	
	public Student1(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Student1) {
			Student1 s = (Student1) o;
			if (name.equals(s.name) && age == s.age);
			result = true;
		}
		return result;
	}
}
