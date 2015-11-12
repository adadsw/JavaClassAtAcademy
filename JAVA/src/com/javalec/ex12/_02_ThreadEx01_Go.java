package com.javalec.ex12;

public class _02_ThreadEx01_Go implements Runnable {
	public void run() {
		while (true) {
			System.out.println("go");
			try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
