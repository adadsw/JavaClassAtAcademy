package com.javalec.ex16;

public class TestInner {
	public static void main(String[] args) {
		Outer_Class outer = new Outer_Class("오승현", 26);
		Outer_Class.Inner_Class inner = outer.new Inner_Class("강남구 논현동");
		System.out.println(inner.getInfo());
	}

}
