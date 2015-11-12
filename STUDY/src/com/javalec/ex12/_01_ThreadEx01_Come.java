package com.javalec.ex12;

public class _01_ThreadEx01_Come extends Thread {
	public void run() {
		while (true) {
			System.out.println("come");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
