package bookstore.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
	public static ArrayList<Book> Bag = new ArrayList<Book>();
	
	public static void listOrder() {
		System.out.println("다음은 구매 목록입니다.");
		Iterator<Book> iterator = Order.Bag.iterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
	}
	
}
