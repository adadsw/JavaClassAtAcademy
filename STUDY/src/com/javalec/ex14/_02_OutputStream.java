package com.javalec.ex14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _02_OutputStream {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/dev/save/_02_output.txt");
			String str = "자바";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (FileNotFoundException e) {
			
		} finally {
			try {
				if (os != null) os.close();
			} catch (Exception e) {
				
			}
		}
	}
}
