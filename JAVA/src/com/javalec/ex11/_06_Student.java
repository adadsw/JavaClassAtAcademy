package com.javalec.ex11;

public class _06_Student {
	private String name;
	private int grade;
	public _06_Student() {}
	public _06_Student (String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return name + ":" + grade;
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("비교");
//		String compareValue = obj.toString();
//		String thisValue = toString();
//		return thisValue.equals(compareValue);
		return hashCode() == obj.hashCode();
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
//		return name.hashCode() + grade;
	}
}
