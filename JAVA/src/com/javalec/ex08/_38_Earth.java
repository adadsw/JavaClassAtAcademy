package com.javalec.ex08;

public class _38_Earth {
	/*
	 * SingleTon 디자인 패턴
	 * 1. 정의 : 단 하나의 인스턴스만 생성하는 경우에 사용할 수 있는 static을 이용한 디자인 패턴
	 * 2. 작성단계 : 1) 생성자를 private으로 지정한다.  
	 * 				 2) 자신의 클래스에서 객체생성한다.
	 * 					. static으로 지정하므로 프로그램 실행시 객체생성이 된다.
	 * 				 3) 다른 클래스에서 접근할 수 있는 방법을 제공한다.
	 * 					. 객체생성 없이 접근할 수 있는 방법으로 제공한다.
	 * 					. 메서드 접근은 클래스이름.메서드명으로 접근한다.
	 */
	private static _38_Earth e = new _38_Earth("지구");
	
	String name;
	
	private _38_Earth(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 다른 클래스 접근 메서드
	public static _38_Earth getEarth() {
		return e;
	}
	
}
