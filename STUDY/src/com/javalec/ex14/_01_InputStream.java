package com.javalec.ex14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _01_InputStream {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/dev/save/_01_input.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				if (i == -1) break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (is != null)	 {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
