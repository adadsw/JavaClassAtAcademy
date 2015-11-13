package com.javalec.ex12;

import java.util.*;

public class _04_VoteThreadEx implements Runnable {
	int sum = 0; // 총 개표율
	int targetNum = 100; // 개표율 100%
	Random random = new Random(); // 개표율 속도

	@Override
	public void run() {

		StringBuffer sb = new StringBuffer(); // *모양의 그래프를 나타내기 위함

		while (true) {
			sum = sum + random.nextInt(10); // 10까지의 난수발생숫자를 누적
			sb.delete(0, sb.toString().length()); // 초기화...*길이만큼

			
			if (sum >= targetNum) {
				sum = 100;
				for (int i = 0; i < sum; i++)
					sb.append('*');
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t: " + sb);
				break;
			} else {
				for (int i = 0;i < sum; i++)
					sb.append('*');
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "\t: " + sb);
			}
			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {}
			
		}
	}
}
