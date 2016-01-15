package com.javalec.ch03_2;

public class StudentInfo {

	private Student student;
	
	public StudentInfo(){}
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
}
