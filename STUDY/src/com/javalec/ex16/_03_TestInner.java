package com.javalec.ex16;

public class _03_TestInner {
	public static void main(String[] args) {
		_03_OuterClass.Inner_Class inner = new _03_OuterClass.Inner_Class("감남구 논현동");
		System.out.println(inner.getInfo());
	}

}
