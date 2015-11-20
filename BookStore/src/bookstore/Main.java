package bookstore;

import static bookstore.domain.CODE.*;

import bookstore.presentation.*;
import bookstore.service.*;

public class Main {
	public static void main(String[] args) {
		int code = SHOP_LOGIN;
		
		Menu menu = MenuImplement.getInstance();
		HostImplement host = HostImplement.getInstance();
		GuestImplement guest = GuestImplement.getInstance();
		Shop shop = Shop.getInstance();

		System.out.println("서점 문을 엽니다.");
		while (true) {
			switch (code) {
			case SHOP_LOGIN:
				code = shop.selectUser();
				break;
			case HOST: // 주인 메뉴
				switch (host.state) {
				case HOST_LOGIN:
					code = menu.hostMenu();
					break;
				case HOST_LOGOUT:
					code = menu.login(HOST);
					break;
				}
				break;
			case HOST_BOOK: // 재고관리
				code = menu.hostBookMenu();
				break;
			case HOST_BOOK_LIST: // 책 목록
				code = host.listBook();
				break;
			case HOST_BOOK_ADD: // 책 추가
				code = host.addBook();
				break;
			case HOST_BOOK_UPDATE: // 책 수정
				code = host.modifyBook();
				break;
			case HOST_BOOK_DEL: // 책 삭제
				code = host.deleteBook();
				break;
			// case HOST_ORDER: // 주문관리
			// code = menu.hostOrderMenu();
			// break;
			case HOST_ORDER_LIST: // 주문 목록
				code = host.listOrder();
				break;
			// case HOST_ORDER_ADD: // 주문 추가
			// code = host.addOrder();
			// break;
			// case HOST_ORDER_DEL: // 주문 삭제
			// code = host.deleteOrder();
			// break;

			case GUEST: // 손님
				switch (guest.state) {
				case GUEST_LOGIN:
					code = GUEST_ORDER;
					break;
				case GUEST_LOGOUT:
					code = menu.login(GUEST);
					break;
				}
				break;
			case GUEST_ORDER:
				code = menu.guestOrderMenu();
				break;
			case GUEST_ORDER_ADD: // 구매
				code = guest.buy();
				break;
			case GUEST_ORDER_DEL: // 환불
				code = guest.refund();
				break;
			case 0:
				return;
			default:
				code = SHOP_LOGIN;
				break;
			}
		}
	}
}
