package com.javalec.ex14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _03_InputOutput_2 {
	public static void main(String[] args) throws IOException {

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:/dev/save/_03_input.txt");
			os = new FileOutputStream("C:/dev/save/_03_output_copy.txt");

			byte[] bs = new byte[5];
			while (true) {
				int count = is.read(bs);
				System.out.println(count);
				if (count == -1)
					break;
				os.write(bs, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (is != null)
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
