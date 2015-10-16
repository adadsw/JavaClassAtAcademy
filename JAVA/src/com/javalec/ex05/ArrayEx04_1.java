package com.javalec.ex05;

public class ArrayEx04_1 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		for (int i = 0; i < score.length; i++)
			for (int j = 0; j <score[i].length; j++)
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]); 
	}

}
