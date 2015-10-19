package com.javalec.ex05;

public class Array02 {
	public static void main(String[] args) {
		int[] score1 = new int[5];
		score1[0] = 100;
		score1[1] = 90;
		score1[2] = 80;
		score1[3] = 70;
		score1[4] = 60;
		
		for (int i = 0; i < score1.length; i++)
			System.out.println("score1[" + i + "] : " + score1[i]);
		System.out.println();

		int[] score2 = { 100, 90, 80, 70, 60 };
		for (int i = 0; i < score2.length; i++)
			System.out.println("score2[" + i + "] : " + score2[i]);
		System.out.println();

		int[] score3 = new int[] { 100, 90, 80, 70, 60 };
		for (int i = 0; i < score3.length; i++)
			System.out.println("score3[" + i + "] : " + score3[i]);

	}

}
