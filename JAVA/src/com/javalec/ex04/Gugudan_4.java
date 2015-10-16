/* 구구단 2~9단 while 문 사용
예시.
==========
*** 2단 ***
==========
2 X 1 = 2
*/
package com.javalec.ex04;

public class Gugudan_4 {
	public static void main(String[] args) {

		int i = 2;
		int j = 1;

		while (i < 10) { // 앞 숫자 순환
			System.out.println("==========");
			System.out.println("*** " + i + "단 ***");
			System.out.println("==========");
			while (j < 10) { // 뒷 숫자 순환
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			j = 1;
			i++;
			System.out.println();
		}

	}

}
