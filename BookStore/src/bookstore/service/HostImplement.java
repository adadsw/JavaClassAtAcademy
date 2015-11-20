package bookstore.service;

import static bookstore.domain.CODE.*;

import bookstore.domain.Book;
import bookstore.domain.Order;
import bookstore.domain.Shelf;
import bookstore.presentation.*;

public class HostImplement implements Host {

	public int state = HOST_LOGOUT;
	private static HostImplement host = new HostImplement();

	private HostImplement() {
	}

	@Override
	public int listBook() {
		Shelf.listBook();
		return HOST_BOOK;
	}

	@Override
	public int addBook() {
		System.out.println("책 정보를 입력하세요.");
		System.out.println("제목");
		String title = Console.input();
		System.out.println("저자");
		String writer = Console.input();
		System.out.println("가격");
		int price = Integer.parseInt(Console.input());
		Shelf.shelf.put(Book.number, new Book(title, writer, price));
		Book.number++;
		System.out.println("책을 책꽂이에 꽂았습니다.");
		return HOST_BOOK;
	}

	@Override
	public int modifyBook() {
		if (Shelf.shelf.isEmpty()) {
			System.out.println("책이 없습니다.");
			return HOST_BOOK;
		}
		// Iterator<Integer> iterator = Shelf.shelf.keySet().iterator();
		listBook();
		int i;
		System.out.println("책번호를 입력하세요.");
		i = Integer.parseInt(Console.input());
		System.out.println("제목");
		String title = Console.input();
		System.out.println("저자");
		String writer = Console.input();
		System.out.println("가격");
		int price = Integer.parseInt(Console.input());
		Shelf.shelf.replace(i, Shelf.shelf.get(i), new Book(i, title, writer, price));
		System.out.println("책정보를 다음과 같이 수정하였습니다.");
		System.out.println(Shelf.shelf.get(i));
		return HOST_BOOK;
	}

	@Override
	public int deleteBook() {
		if (Shelf.shelf.isEmpty()) {
			System.out.println("책이 없습니다.");
			return HOST_BOOK;
		}
		listBook();
		int i;
		System.out.println("삭제하실 책 번호를 입력하세요.");
		i = Integer.parseInt(Console.input());
		Shelf.shelf.remove(i);
		System.out.println("책을 책꽂이에서 제거하였습니다.");
		listBook();
		return HOST_BOOK;
	}

	@Override
	public int listOrder() {
		Order.listOrder();
		return HOST_LOGIN;
	}

//	@Override
//	public int addOrder() {
//		Shelf.listBook();
//		System.out.println("주문 추가할 책의 번호를 입력하세요.");
//		int i = Integer.parseInt(Console.input());
//		Order.Bag.add(Shelf.shelf.get(i));
//		System.out.println("다음은 주문된 목록입니다.");
//		Iterator<Book> iterator = Order.Bag.iterator();
//		while (iterator.hasNext())
//			System.out.println(iterator.next());
//		return HOST_ORDER;
//	}
//
//	@Override
//	public int deleteOrder() {
//		if (Order.Bag.isEmpty()) {
//			System.out.println("주문 항목이 없습니다.");
//			return GUEST_ORDER;
//		}
//		try {
//			for (int i = 0; i < Order.Bag.size(); i++) {
//				System.out.println(Order.Bag.get(i).OrderedList(i));
//			}
//		} catch (NullPointerException npe) {
//			System.out.println("주문 항목이 없습니다.");
//			npe.getMessage();
//			return GUEST_ORDER;
//		}
		
//		System.out.println("주문 삭제할 책의 번호를 입력하세요.");
//		int i = Integer.parseInt(Console.input());
//		Order.Bag.remove(Order.Bag.get(i - 1));
//		System.out.println("주문 삭제하였습니다.");
//		return HOST_ORDER;
//	}

	@Override
	public void hostLogin() {
		System.out.println("Good day, Sir.");
		state = HOST_LOGIN;
	}

	@Override
	public void hostLogout() {
		state = HOST_LOGOUT;
	}

	public static HostImplement getInstance() {
		return host;
	}
}
