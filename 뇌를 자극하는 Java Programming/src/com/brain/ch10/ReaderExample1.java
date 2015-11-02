package com.brain.ch10;
import java.io.*;
class ReaderExample1 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem.txt");
			while (true) {
			    int data = reader.read();
			    if (data == -1) {
				break;
			    }
			    char ch = (char) data;
			    System.out.print(ch);
			}
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (IOException ioe)	 {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally {
			try {
				reader.close();
			}
			catch (Exception e) {
			}
		}
	}
}