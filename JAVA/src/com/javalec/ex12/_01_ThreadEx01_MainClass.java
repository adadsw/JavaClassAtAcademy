/*
 * Thread 작성(Thread 클래스 이용)
 * 1. Thread를 상속받는다. 상속을 받으면 클래스가 쓰레드가 된다.
 * 2. 클래스 안의 메서드를 run()으로 바꾼다.
 * 3. main Method에서 객체(쓰레드) 생성 후
 * 4. run() 메서드를 호출하려면 start() 메서드로 호출
 * 5. 병행처리된다. 즉, 쓰레드 스케쥴러에 의해 멀티쓰레드가 동작된다고 할 수 있다.
 */
package com.javalec.ex12;

public class _01_ThreadEx01_MainClass {
	
	public static void main(String args[]) {
		_01_ThreadEx01_Come come = new _01_ThreadEx01_Come();
		_01_ThreadEx01_Go go = new _01_ThreadEx01_Go();
		
		come.start();
		go.start();
		
	}

}
