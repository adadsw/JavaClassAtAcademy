package bookstore.presentation;

import java.io.*;
import bookstore.domain.CODE;

public class Console implements CODE {
	
	private static BufferedReader reader;
	
	public static String input() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("▶ ");
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException e) {
			System.out.println("키보드 입력 에러");
			e.printStackTrace();
		}
		return str;
	}
	
}
