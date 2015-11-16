package com.javalec.ex14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _03_InputOut_1 {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:/dev/save/_03_input.txt");
			os = new FileOutputStream("C:/dev/save/_03_input_copy.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				if (i == -1)
					break;
				os.write(i);
			}  
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
