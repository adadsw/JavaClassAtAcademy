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
	
	/*
	 * Object의 equals 메서드는 참조데이터의 실제 값을 비교할 때 사용한다.
	 * Object 클래스의 equals 메서드는 내부적으로 ==연산자로 구현되어 있다.
	 * 따라서 비교하면 실제값 비교가 아닌 위치값 비교가 된다.
	 * 실제값을 비교하려면 equals() 메서드를 Overriding 해야한다.
	 * equals()로 비교해서 true를 얻은 두 객체의 hashCode() 값은 일치해야 한다.
	 * Object 클래스의 hsahCode()는 객체의 내부주소를 반환한다.
	 */
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("비교");
//		String compareValue = obj.toString();
//		String thisValue = toString();
//		return thisValue.equals(compareValue);
		return hashCode() == obj.hashCode();
	}
	
	//hashCode()는 객체의 내부주소를 반환한다. 즉 내부주소값을 정수로 구현
	@Override
	public int hashCode() {
		return toString().hashCode();
//		return name.hashCode() + grade;
	}
}
