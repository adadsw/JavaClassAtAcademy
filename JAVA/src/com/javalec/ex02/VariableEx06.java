package com.javalec.ex02;

public class VariableEx06 {
	public static void main(String[] args) {
		
		//묵시적 형 변환 4byte에서 1byte이기 때문에 값에 변화가 없다.
		byte b = 10;
		int i = (int)b;
		System.out.println("i: " + i);
		System.out.println("b: " + b);
		
		//명시적 형 변환 int->byte 이므로 값 300의 9번째 비트 값이 잘려나간다.
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println("i2: " + i2);
		System.out.println("b2: " + b2);
	}

}
