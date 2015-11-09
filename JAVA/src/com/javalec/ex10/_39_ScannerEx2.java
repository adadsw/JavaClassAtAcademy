package com.javalec.ex10;


import java.io.File;
import java.util.Scanner;

public class _39_ScannerEx2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/dev/save/data39.txt"));
		int sum = 0;
		int cnt = 0;
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		System.out.println("sum = " + sum);
		System.out.println("average = " + (double)sum / cnt);
	}

}
