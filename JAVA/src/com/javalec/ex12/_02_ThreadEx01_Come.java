package com.javalec.ex12;

public class _02_ThreadEx01_Come implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("come");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
