/*
 * Thread 작성 (2. Runnable 인터페이스 이용)
 * 1. Runnable을 implements한다.
 * 2. Runnable 인터페이스의 run()이라는 추상메서드를 구현한다.
 * 		아직까지는 come 클래스가 쓰레드가 아니다.
 * 		쓰레드를 상속받지 않았기 때문에
 * 3. 클래스 안의 메서드를 run()으로 바꾼다.
 * 4. main 메서드에서 객체생성한다.
 * 5. 쓰레드 생성 후 객체참조변수를 인자값으로 넣는다. 그래야 쓰레드가 된다.
 * 6. 병행처리된다. 즉 쓰레드 스케쥴러에 의해 멀티쓰레드가 동작된다고 할 수 있다.
 */
package com.javalec.ex12;

public class _02_ThreadEx01_MainClass {
	public static void main(String[] args) {
		_02_ThreadEx01_Come come = new _02_ThreadEx01_Come();
		Thread t1 = new Thread(come);
//		come.run();
		t1.start();
		_02_ThreadEx01_Go go = new _02_ThreadEx01_Go();
		Thread t2 = new Thread(go);
		t2.start();
	}
}
