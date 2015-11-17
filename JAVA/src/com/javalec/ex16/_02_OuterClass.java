package com.javalec.ex16;

/*
 * 2. local 내부클래스
 * 	1) 외부클래스의 멤버메서드 안에서 정의된 클래스
 * 	2) 멤버메서드 안에서 내부클래스를 객체생성한다.
 *  3) 멤버메서드의 로컬변수와 같이 동작한다.
 *  4) 메서드 호출 시 생성되고 끝나면 소멸한다.
 *  5) 내부클래스에서 외부클래스의 멤버변수와 상수만 
 *     접근가능하며 로컬변수는 접근불가하다.
 * 3. 구성
 * 		class Outer {
 * 			...
 * 			public void methodA() {
 * 				class inner {
 * 					
 * 				}
 * 			}
 * 		}
 */
public class _02_OuterClass {
	private String name;
	private int age;

	public _02_OuterClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void inner_test() {
		int num = 4;
		final int size = 10;

		class Inner_Class {
			private String address;

			public Inner_Class(String address) {
				this.address = address;
			}

			public String getInfo() {
				// 지역변수 접근 불가
				System.out.println("inner_test() : " + num);
				System.out.println("inner_test() : " + size);
				return name + " " + age + " " + address;
			}
		}
		Inner_Class in = new Inner_Class("서대문구 남가좌동");
		System.out.println(in.getInfo());
	}
}
