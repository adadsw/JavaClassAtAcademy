package com.javalec.ex07;

public class _20_BlockTest {
	
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public _20_BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		_20_BlockTest bt = new _20_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		_20_BlockTest bt2 = new _20_BlockTest();
	}

}
