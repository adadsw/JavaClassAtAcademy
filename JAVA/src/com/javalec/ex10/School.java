package com.javalec.ex10;

public class School {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	School(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public boolean equals(School obj) {
		School school = (School) obj;
		if (name.equals(school.name) && kor == school.kor && eng == school.eng && mat == school.mat)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return name + ", " + kor + ", " + eng + ", " + mat; 
	}
	
	// Main
	public static void main(String[] args) {
		School school1 = new School("장동건", 90, 80, 70);
		School school2 = new School("장동건", 90, 80, 70);
		if (school1 == school2) {
			System.out.println(" == 참");
		} else {
			System.out.println(" == 거짓");
		}
		if (school1.equals(school2)) {
			System.out.println("equals 참");
		} else {
			System.out.println("equals 거짓");
		}
		
		System.out.println(school1);
		System.out.println(school2);
	}
}
