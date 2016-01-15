package com.javalec.ch02_4;

public class StudentInfo {
	Student student;
	
	// DI(Dependency Injection) : 의존주입..생성자를 이용한 의존주입
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	// DI(Dependency Injection) : 의존주입..set을 이용한 의존주입
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if (student != null) {
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("반 : " + student.getClassNum());
			System.out.println("=============================");
		}
	}
}
