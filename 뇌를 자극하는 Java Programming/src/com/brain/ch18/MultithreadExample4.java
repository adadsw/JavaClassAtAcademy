package com.brain.ch18;

public class MultithreadExample4 {
	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		MonitorThread thread3 = new MonitorThread(thread1);
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread3.start();
		thread1.start();
		thread2.start();
		
	}

}
