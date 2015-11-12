package com.javalec.ex12;

public class _00_ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("현재 수행되고 있는 쓰레드 이름:>> " + Thread.currentThread().getName());
		System.out.println("쓰레드의 최소우선순위값은:>>" + Thread.currentThread().MIN_PRIORITY);
		System.out.println("쓰레드의 최대우선순위값:>>" + Thread.currentThread().MAX_PRIORITY);
		System.out.println("쓰레드의 중간우선순위값:>>" + Thread.currentThread().NORM_PRIORITY);
		System.out.println("현재 수행되고 있는 쓰레드의 우선순위:>>"  +Thread.currentThread().getPriority());
	}

}
