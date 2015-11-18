package bookstore.presentation;

import java.util.Scanner;
import bookstore.domain.CODE;

public class Console implements CODE {
	
	private static Console console = new Console();
	private static Scanner scanner;
	
	private Console() {}
	
	public static Console getInstance() {
		return console;
	}
	
	public static String input() {
		scanner = new Scanner(System.in);
		System.out.print("▶ ");
		return scanner.nextLine();
	}
}
