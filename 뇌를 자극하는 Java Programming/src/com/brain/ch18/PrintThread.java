package com.brain.ch18;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		while (sharedArea.isReady != true)
			continue;
		System.out.println(sharedArea.result);
	}
}
