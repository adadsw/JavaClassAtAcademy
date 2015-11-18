package bookstore.presentation;

import static bookstore.domain.CODE.*;

import bookstore.service.Guest;
import bookstore.service.GuestImplement;
import bookstore.service.Host;
import bookstore.service.HostImplement;

public class MenuImplement implements Menu {
	int code;
	HostImplement host = HostImplement.getInstance();
	GuestImplement guest = GuestImplement.getInstance();

	private static MenuImplement menu = new MenuImplement();

	private MenuImplement() {
	}

	public static MenuImplement getInstance() {
		return menu;
	}

	@Override
	public int selectUser() {
		System.out.println("1: 주인, 2: 손님, 0: 나가기");
		code = Integer.parseInt(Console.input());
		switch (code) {
		case 1:
			code = HOST;
			break;
		case 2:
			code = GUEST;
			break;
		default:
			code = SHOP_LOGIN;
		}
		return code;
	}

	@Override
	public int login(String user) {
		switch (user) {
		case "tryHost":
			if (host.state == HOST_LOGIN)
				return HOST;
			break;
		case "tryGuest":
			if (guest.state == GUEST_LOGIN)
				return GUEST;
			break;
		}
		System.out.println("아이디를 입력하여 주십시오.");
		String id = Console.input();
		System.out.println("비밀번호를 입력하여 주십시오.");
		String pass = Console.input();
		switch (user) {
		case "tryHost":
			if (Host.ID.equals(id) && Host.PASS.equals(pass)) {
				host.hostLogin();
				return HOST;
			}
			break;
		case "tryGuest":
			if (Guest.ID.equals(id) && Guest.PASS.equals(pass)) {
				guest.guestLogin();
				return GUEST;
			}
			break;
		}
		System.out.println("로그인 실패");
		return SHOP_LOGIN;
	}

	@Override
	public int hostMenu() {
		System.out.println("Good day, Sir.");
		System.out.println("1: 재고관리, 2: 주문관리, 0: 나가기");
		code = Integer.parseInt((Console.input()));
		switch (code) {
		case 1:
			code = HOST_BOOK;
			break;
		case 2:
			code = HOST_ORDER;
			break;
		case 0:
			code = SHOP_LOGIN;
			host.hostLogout();
			break;
		default:
			System.out.println("다시 입력하여 주십시오.");
			code = HOST;
			break;
		}
		return code;
	}

	public int hostBookMenu() {
		System.out.println("1: 책 목록, 2: 책 추가, 3: 책 수정, 4:책 삭제, 0: 나가기");
		code = Integer.parseInt((Console.input()));
		switch (code) {
		case 1:
			code = HOST_BOOK_LIST;
			break;
		case 2:
			code = HOST_BOOK_ADD;
			break;
		case 3:
			code = HOST_BOOK_UPDATE;
			break;
		case 4:
			code = HOST_BOOK_DEL;
			break;
		case 0:
			code = HOST;
			break;
		default:
			System.out.println("다시 입력하여 주십시오.");
			code = HOST_BOOK;
			break;
		}
		return code;
	}

	@Override
	public int hostOrderMenu() {
		System.out.println("1: 주문 목록, 2: 주문 추가, 3: 주문 삭제 0: 나가기");
		code = Integer.parseInt(Console.input());
		switch (code) {
		case 1:
			code = HOST_ORDER_LIST;
			break;
		case 2:
			code = HOST_ORDER_ADD;
			break;
		case 3:
			code = HOST_ORDER_DEL;
			break;
		case 0:
			code = HOST;
			break;
		default:
			System.out.println("다시 입력하여 주십시오.");
			code = HOST_ORDER;
			break;
		}
		return code;
	}

	public int guestOrderMenu() {
		System.out.println("1: 구매, 2: 환불, 0: 나가기");
		code = Integer.parseInt((Console.input()));
		switch (code) {
		case 1:
			code = GUEST_ORDER_ADD;
			break;
		case 2:
			code = GUEST_ORDER_DEL;
			break;
		case 0:
			code = SHOP_LOGIN;
			guest.guestLogout();
			break;
		default:
			System.out.println("다시 입력하여 주십시오.");
			code = GUEST_ORDER;
			break;
		}
		return code;
	}

}
