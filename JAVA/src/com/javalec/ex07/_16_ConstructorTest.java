package com.javalec.ex07;

class Data1 {
	Data1() {
	} // 생략을 한 경우 컴파일러가 기본 생성자를 추가한다.

	int value = 3;
}

class Data2 {
	int value;

	Data2() {
	}

	Data2(int x) {
		value = x;
	}
}

class Data3 {
	String name;
	int number;
	int price;

	Data3 () {}
	
	Data3 (String name, int number, int price) {
		this.name = name;
		this.number = number;
		this.price = price;
	}
	
}

public class _16_ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		System.out.println("Data1() 기본생성자 호출");
		System.out.println("d1.value--> " + d1.value);
		System.out.println();
		
		// Data2 d2 = new Data2(); //compile error 발생
		Data2 d2 = new Data2();
		d2 = new Data2(5);
		System.out.println("Data2(int x) : 매개변수 있는 생성자 호출");
		System.out.println(d2.value);
		System.out.println();

		Data3 d3 = new Data3();
		d3 = new Data3("사과", 1, 500);
		System.out.println("d3.name--> " + d3.name);
		System.out.println("d3.number--> " + d3.number);
		System.out.println("d3.price--> " + d3.price);
	}
}
