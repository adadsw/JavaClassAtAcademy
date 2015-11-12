package com.javalec.ex12;

public class _03_MainClass {
	public static void main(String[] args) {
		_03_ThreadEx01 threadEx = new _03_ThreadEx01();
		
		Thread thread1 = new Thread(threadEx, "A");
		Thread thread2 = new Thread(threadEx, "B");
		thread1.start();
		thread2.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}
