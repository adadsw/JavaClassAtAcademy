package com.javalec.ex12;

public class _03_MainClass {
	public static void main(String[] args) {
		//객체 1개당 쓰레드가 2개 발생. 객체에 선언되어 있는 인스턴스변수를 쓰레드에서 공유하게 되어,
		// 인스턴스 값에 영향을 미친다.
		// 객체 1개당 쓰레드 2개를 공유하므로 Thread Name이 B인 경우도 같이 증가함
		_03_ThreadEx01 threadEx = new _03_ThreadEx01();
		
		Thread thread1 = new Thread(threadEx, "A"); // "A" : 쓰레드 이름
		Thread thread2 = new Thread(threadEx, "B"); //"B" : _03_ThreadEx01의 Thread.cu
		thread1.start();	//run() 호출 쓰레드 A
		thread2.start();	//run() 호출 쓰레드 B
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}
