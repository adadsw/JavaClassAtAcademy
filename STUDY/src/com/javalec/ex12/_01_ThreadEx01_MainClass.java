package com.javalec.ex12;

public class _01_ThreadEx01_MainClass {
	public static void main(String[] args) {
		_01_ThreadEx01_Come come = new _01_ThreadEx01_Come();
		_01_ThreadEx01_Go go = new _01_ThreadEx01_Go();
		
		come.start();
		go.start();
	}

}
