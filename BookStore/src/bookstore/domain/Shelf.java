package bookstore.domain;

import java.util.*;


public class Shelf {
	public static Map<Integer, Book> shelf = new HashMap<Integer, Book>();
	
	public static void listBook() {
		if (Shelf.shelf.isEmpty()) {
			System.out.println("책이 없습니다.");
			return;
		}
		Iterator<Integer> iterator = Shelf.shelf.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(shelf.get(iterator.next()));
		}
	}
}
