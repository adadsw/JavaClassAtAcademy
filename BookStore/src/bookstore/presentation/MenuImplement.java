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

	//로그인 메서드. 본래 주인, 손님을 따로 만들어 각각의 HostImplement와 GuestImplement에 
	//넣어 실행하였으나 기능이 중복되어 그냥 하나의 메서드로 만들었음
	@Override
	public int login(int user) {		
		switch (user) {
		case HOST:
			if (host.state == HOST_LOGIN)
				return HOST;
			break;
		case GUEST:
			if (guest.state == GUEST_LOGIN)
				return GUEST;
			break;
		}
		System.out.println("로그인 정보를 입력하세요.");
		System.out.println("아이디");
		String id = Console.input();
		System.out.println("암호");
		String pass = Console.input();
		switch (user) {
		case HOST:
			if (Host.ID.equals(id) && Host.PASS.equals(pass)) {
				host.hostLogin();
				return HOST;
			}
			break;
		case GUEST:
			if (Guest.ID.equals(id) && Guest.PASS.equals(pass)) {
				guest.guestLogin();
				return GUEST;
			}
			break;
		}
		System.out.println("로그인 실패");
		return SHOP_LOGIN;
	}
	
	// 주인으로 접속 시 메뉴
	@Override
	public int hostMenu() {
		System.out.println("1:재고관리, 2:주문목록, 0:종료");
		try {
			code = Integer.parseInt(Console.input());
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력하여 주십시오.");
			return HOST;
		}
		switch (code) {
		case 1:
			code = HOST_BOOK;
			break;
		case 2:
			code = HOST_ORDER_LIST;
			break;
		case 0:
			code = SHOP_LOGIN;
			host.hostLogout();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			code = HOST;
			break;
		}
		return code;
	}

	// 1. 주인 -> 1. 재고관리
	public int hostBookMenu() {
		System.out.println("1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료");
		try {
			code = Integer.parseInt(Console.input());
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력하여 주십시오.");
			return HOST_BOOK;
		}
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
	

	//원래 1. 주인 -> 2. 주문관리 -> 1. 주문목록이 되어야 하는데
	//1. 주인 - > 2. 주문목록으로 로그가 구현되었길래 걍 주석처리 함
//	@Override
//	public int hostOrderMenu() {
//		System.out.println("1: 주문 목록, 2: 주문 추가, 3: 주문 삭제 0: 나가기");
//		try {
//			code = Integer.parseInt(Console.input());
//		} catch (NumberFormatException nfe) {
//			System.out.println("숫자를 입력하여 주십시오.");
//			return HOST_ORDER;
//		}
//		switch (code) {
//		case 1:
//			code = HOST_ORDER_LIST;
//			break;
//		case 2:
//			code = HOST_ORDER_ADD;
//			break;
//		case 3:
//			code = HOST_ORDER_DEL;
//			break;
//		case 0:
//			code = HOST;
//			break;
//		default:
//			System.out.println("다시 입력하여 주십시오.");
//			code = HOST_ORDER;
//			break;
//		}
//		return code;
//	}

	//2. 손님 -> 메뉴
	public int guestOrderMenu() {
		System.out.println("1:구매, 2:환불, 0:종료");
		try {
			code = Integer.parseInt(Console.input());
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력하여 주십시오.");
			return GUEST_ORDER;
		}
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
