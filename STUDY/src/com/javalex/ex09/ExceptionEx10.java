package com.javalex.ex09;

public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[0];
			System.out.println("평균:" + getAverage(arr));
			System.out.println("합계:" + getTotal(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static double getAverage(int arr[]) throws Exception {
		if (arr.length == 0)
			throw new Exception("평균 : 비어있는 배열입니다.");
		return getTotal(arr) / arr.length;
	}
	static double getTotal(int arr[]) throws Exception {
		if (arr.length == 0)
			throw new Exception("합계 : 비어있는 배열입니다.");
			int total = 0;
			for (int num : arr)
				total += num;
			return total;
	}

}
