package bookstore.service;

import static bookstore.domain.CODE.*;

import java.util.Iterator;

import bookstore.domain.Book;
import bookstore.domain.Shelf;
import bookstore.presentation.*;


public class HostImplement implements Host {
	
	public int state = HOST_LOGOUT;
	private static HostImplement host = new HostImplement();
	private HostImplement() {}
	

	@Override
	public int listBook() {
		Iterator<Book> iterator = Shelf.shelf.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
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
		Shelf.shelf.add(new Book(title, writer, price));
		System.out.println("책을 책꽂이에 꽂았습니다.");
		return HOST_BOOK;
	}

	@Override
	public void modifyBook() {

	}

	@Override
	public void deleteBook() {

	}

	
	@Override
	public void listOrder() {

	}

	@Override
	public void addOrder() {

	}

	@Override
	public void deleteOrder() {

	}

	@Override
	public void hostLogin() {
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
