package bookstore.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
	public static ArrayList<Book> Bag = new ArrayList<Book>();
	
	public static void listOrder() {
		if (Order.Bag.isEmpty()) {
			System.out.println("주문이 없습니다.");
			return;
		}
		System.out.println("다음은 주문 목록입니다.");
		Iterator<Book> iterator = Order.Bag.iterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
	}
	
}
