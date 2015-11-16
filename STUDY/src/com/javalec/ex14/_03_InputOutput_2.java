package com.javalec.ex14;
import java.io.*;
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
			
		} finally {
			if (is != null)
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				
			}
		}
	}
}
