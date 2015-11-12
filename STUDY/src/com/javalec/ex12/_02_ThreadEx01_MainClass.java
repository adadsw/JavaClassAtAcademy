package com.javalec.ex12;

public class _02_ThreadEx01_MainClass {
	public static void main(String[] args) {
		_02_ThreadEx01_Come come = new _02_ThreadEx01_Come();
		Thread t1 = new Thread(come);
		
		t1.start();
		_02_ThreadEx01_Go go = new _02_ThreadEx01_Go();
		Thread t2 = new Thread(go);
		t2.start();
	}
}
