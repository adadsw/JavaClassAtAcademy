package com.javalec.ex03;

public class OperatorEx13 {

	public static void main(String[] args) {

		char c = 'a';

		for (int i = 0; i < 26; i++)
			System.out.print(c++);

		System.out.println(); // println은 줄바꿈 해주고 print 하면 걍 써줌

		c = 'A';

		for (int i = 0; i < 26; i++)
			System.out.print(c++);

		System.out.println();

		c = '0';
		for (int i = 0; i < 10; i++)
			System.out.print(c++);

		System.out.println();
		
//		int arr[];
//		arr = new int[10];
//		
//		arr[0] = 1;
//		arr[1] = 1;
//		System.out.println("첫번째 값 : 1");
//		System.out.println("두번째 값 : 1");
//		for(int i = 2;i<10;i++){
//			arr[i] = arr[i-1] + arr[i-2];
//			System.out.print(i+1 + "번째 값 : ");
//			System.out.println(arr[i]);
//		}
	}
}
