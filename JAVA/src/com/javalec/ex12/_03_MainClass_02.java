package com.javalec.ex12;

public class _03_MainClass_02 {
	public static void main(String[] args) {
		//객체 1개당 쓰레드 1개 
		//Thread Name이 A일 경우만 testNum이 1증가한다.
		//객체 1개당 쓰레드 1개를 사용하므로 Thread Name이 B일 경우는 0임
		_03_ThreadEx02 threadEx1 = new _03_ThreadEx02();
		_03_ThreadEx02 threadEx2 = new _03_ThreadEx02();
		
		Thread thread1 = new Thread(threadEx1, "A");
		Thread thread2 = new Thread(threadEx2, "B");
		
		thread1.start();
		thread2.start();
	}
}
