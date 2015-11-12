package com.javalec.ex12;

public class _03_MainClass_02 {
	public static void main(String[] args) {
		_03_ThreadEx02 threadEx1 = new _03_ThreadEx02();
		_03_ThreadEx02 threadEx2 = new _03_ThreadEx02();
		
		Thread thread1 = new Thread(threadEx1, "A");
		Thread thread2 = new Thread(threadEx2, "B");
		
		thread1.start();
		thread2.start();
	}
}
