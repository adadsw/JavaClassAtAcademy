package bookstore.service;

import java.util.Scanner;

public class Input {
	public static String input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("▶ ");
		return scanner.nextLine();
	}
}
