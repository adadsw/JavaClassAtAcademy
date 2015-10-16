package com.javalec.ex03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		// 후위 연산자 : i 값을 j에 대입한 후, j값을 증가시킨다.
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

		// 전위 연산자 : i값을 증가시킨 후, j에 대입한다.
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
	}
}
