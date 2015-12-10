package bookstore.service;

import static bookstore.domain.CODE.*;

import java.util.Iterator;

import bookstore.domain.Book;
import bookstore.domain.Order;
import bookstore.domain.Shelf;
import bookstore.presentation.Console;

public class GuestImplement implements Guest {

	private static GuestImplement guest;

	private GuestImplement() {
	}
	
	public static GuestImplement getInstance() {
		if (guest == null) {
			guest = new GuestImplement();
		}
		return guest;
	}

	public int state = GUEST_LOGOUT;

	@Override
	public int buy() {
		if (Shelf.shelf.isEmpty()) {
			System.out.println("구매 가능한 도서가 없습니다.");
			return GUEST_ORDER;
		}
		Shelf.listBook();	
		System.out.println("구입할 책의 번호를 입력하세요.");
		int i = Integer.parseInt(Console.input());
		if (Shelf.shelf.get(i) == null) { 
			System.out.println("해당 번호의 책이 없습니다.");
			return GUEST_ORDER;
		}
		Order.Bag.add(Shelf.shelf.get(i));
		System.out.println("다음은 구매한 목록입니다.");
		Iterator<Book> iterator = Order.Bag.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		return GUEST_ORDER;
	}

	@Override
	public int refund() {
		if (Order.Bag.isEmpty()) {
			System.out.println("구입 항목이 없습니다.");
			return GUEST_ORDER;
		}
		try {
			for (int i = 0; i < Order.Bag.size(); i++) {
				System.out.println(Order.Bag.get(i).OrderedList(i));
			}
		} catch (NullPointerException npe) {
			System.out.println("구입 항목이 없습니다.");
			npe.getMessage();
			return GUEST_ORDER;
		}
		
		System.out.println("환불할 책의 번호를 입력하세요.");
		int i = Integer.parseInt(Console.input());
		Order.Bag.remove(Order.Bag.get(i - 1));
		System.out.println("책을 환불하였습니다.");
		return GUEST_ORDER;
	}

	@Override
	public void guestLogin() {
		state = GUEST_LOGIN;
	}

	@Override
	public void guestLogout() {
		state = GUEST_LOGOUT;
	}

	

}
