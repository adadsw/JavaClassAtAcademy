package com.brain.ch10;
import java.io.*;

class WriterExample1 {
    public static void main(String args[]) {
	FileOutputStream out = null;
	try {
	    out = new FileOutputStream("output.dat");
	    byte arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	    for (int cnt = 0; cnt < arr.length; cnt++)
	        out.write(arr[cnt]);
	}
	catch (IOException ioe) {
	    System.out.println("���Ϸ� ����� �� �����ϴ�.");
	}
	finally {
	    try {
		out.close();
	    }
	    catch (Exception e) {
	    }
	}
    }
}