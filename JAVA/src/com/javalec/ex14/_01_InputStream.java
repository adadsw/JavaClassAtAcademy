package com.javalec.ex14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _01_InputStream {
	public static void main(String[] args) throws IOException {
/*
 * 스트림 : 시냇물이라는 뜻이지만, 프로그래밍에서는 일차원적인 데이터의 흐름을 말한다. 자바에서는 입력되고 출력되는 모든
 * 데이터를 스트림 형태로 주고 받는다. 데이터 방향 1) 입력 스트림 : 프로그램으로 들어오는 스트림 2) 출력 스트림 :
 * 프로그램에서 밖으로 나가는 스트림 데이터 형태 1) 문자 스트림 : 사람이 이해할 수 있는 문자로 구성된 스트림 2) 바이트
 * 스트림 : 사람이 이해할 순 없지만 프로그램에서 사용할 수 있는 데이터로
 */
		InputStream is = null;
		try {
			is = new FileInputStream("C:/dev/save/_01_input.txt");
			while (true) {
				int i = is.read(); // 데이터를 1byte씩 읽어옴
				System.out.println("데이터 : " + i);
				if (i == -1) break; //데이터가 없으면 빠져나온다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
