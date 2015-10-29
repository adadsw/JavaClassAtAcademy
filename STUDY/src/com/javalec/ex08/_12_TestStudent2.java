package com.javalec.ex08;

public class _12_TestStudent2 {
	public static void main(String[] args) {
		_12_Student student = new _12_Student();
		System.out.println(student.getInfo());
		student.getTest(student);
		
		_12_Student middle = new _12_Middle("땅꼬마", 1);
		System.out.println(middle.getInfo());
		middle.getTest(middle);
		
		_12_Student college = new _12_College("이효리", 3, 30);
		System.out.println(college.getInfo());
		college.getTest(college);
		
		_12_College college2 = (_12_College) college;
		System.out.println(college2.getUnit());
	}
}

class _12_Student {
	public String name;
	public int grade;
	
	public _12_Student() {
		System.out.println("부모생성자 호출");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getInfo() {
		return "이름 : " + name + ", 학년 : " + grade;
	}
	
	public void getTest(_12_Student s) {
		if (s instanceof _12_Middle) {
			System.out.print("Middle 입니다.");
			System.out.println(" 시험점수 구하기");
		} else if (s instanceof _12_College) {
			System.out.print("College 입니다.");
			System.out.println(" 시험점수 구하기");
		}
	}
}

class _12_College extends _12_Student {
	public int unit;
	
	public _12_College() {}
	_12_College(String name, int grade, int unit) {
		System.out.println("College 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.unit = unit;
	}
	public int getUnit() {
		return unit;
	}
	
	@Override
	public String getInfo() {
		return "이름 : " + name + ", 학년 : " + grade + ", 학점 : " + unit;
	}
}

class _12_Middle extends _12_Student {
	public _12_Middle() {}
	
	_12_Middle(String name, int grade) {
		System.out.println("미들 생성자 호출");
		super.name = name;
		super.grade = grade;
	}
}