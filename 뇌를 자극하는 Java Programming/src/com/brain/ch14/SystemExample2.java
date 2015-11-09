package com.brain.ch14;
import java.io.*;
public class SystemExample2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			String str = reader.readLine();
			System.out.println("입력된 문자열: " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
