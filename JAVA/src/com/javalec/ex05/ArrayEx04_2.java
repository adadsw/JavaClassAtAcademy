package com.javalec.ex05;

public class ArrayEx04_2 {
	public static void main(String[] args) {

		int[] score = { 10, 20, 30, 40, 50 };
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (i == 2) {
				System.out.println("sum : " + sum);
			}
		}

		for (int i = 0; i < 5; i++)
			System.out.println("score[" + i + "] : " + score[i]);

		System.out.println("====================");

		int[][] score2 = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 }, { 90, 100 }, };
		sum = 0;
		for (int i = 0; i < score2.length; i++)
			for (int j = 0; j < score2[i].length; j++) {

				sum += score2[i][j];
				//System.out.println("score2[" + i + "][" + j + "] : " + score2[i][j]);
				/*if (i == score2.length -1 && j == score2[i].length -1)
				System.out.println("sum : " + sum);*/
			}
		System.out.println("sum : " + sum);

		// =============================================

		int[][] jumsu = { { 100, 100, 100 }, { 20, 30, 40 }, { 50, 60, 70, }, };
		for (int i = 0; i < jumsu.length; i++)
			for (int j = 0; j < jumsu[i].length; j++)
				System.out.println(jumsu[i][j]);

	}

}
