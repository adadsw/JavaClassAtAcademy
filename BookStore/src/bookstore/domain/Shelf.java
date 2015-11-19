package bookstore.domain;

import java.util.*;


public class Shelf {
	public static Map<Integer, Book> shelf = new HashMap<Integer, Book>();
	
	public static void listBook() {
		Iterator<Integer> iterator = Shelf.shelf.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(shelf.get(iterator.next()));
		}
	}
}
