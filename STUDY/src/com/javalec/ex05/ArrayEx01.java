package com.javalec.ex05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

}
