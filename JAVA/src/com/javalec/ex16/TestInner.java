package com.javalec.ex16;

public class TestInner {
	public static void main(String[] args) {
		Outer_Class outer = new Outer_Class("오승현", 26);
		Outer_Class.Inner_class inner = outer.new Inner_class("서울시 서대문구");
		System.out.println(inner.getInfo());
	}
}
