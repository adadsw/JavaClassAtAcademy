/*
 * 서점에서, 주인을 위한 주문관리, 재고관리 기능과 손님을 위한 구매, 환불 기능이 있는 프로그램입니다.
 * 
 * bookstore.Main	..Main. switch/case문으로 각 메뉴를 연결
 * 					변수 code를 통해 메인->기능
 * 					기능에서 또 다른 기능의 code 값을 리턴하여 다음 기능으로 연결
 * 
 * 각 패키지에 포함된 클래스 간략 설명
 * bookstore.domain.Book	..책 객체 
 * bookstore.domain.CODE	..SHOP_LOGIN, HOST_BOOK 등의 각 상수값
 * bookstore.domain.Order	..Guest가 buy()한 책을 저장할 ArrayList<Book>
 * bookstore.domain.Shelf	..Host가 addBook()한 책을 저장할 HashMap<Integer, Book>
 * 							  이걸로 책 목록, 추가, 수정, 삭제 구현
 * 
 * bookstore.presentation.Console	..값 입력 메서드만 구현
 * bookstore.presentation.Menu		..메뉴 기능 정의서
 * bookstore.presentation.MenuImplement	..login, host, guest의 메뉴를 구현
 * 
 * bookstore.service.Guest ..기능 정의
 * bookstore.service.GuestImplement	.. 구매, 환불
 * bookstore.service.Host ..기능 정의
 * bookstore.service.HostImplement	..책 추가, 삭제, 수정, 목록. 그리고 주문 목록.
 * bookstore.service.Shop	..샵 오픈 시 메시지. 1, 2선택에 따른 주인, 손님 로그인 method 호출
 * 
 */

package bookstore;

import static bookstore.domain.CODE.*;

import bookstore.presentation.*;
import bookstore.service.*;

public class Main {
	public static void main(String[] args) {
		int code = SHOP_LOGIN;
		
		// 각 객체는 Singtone으로서 한 번만 만들어지고 각 클래스의 getInstance()로 호출
		Menu menu = MenuImplement.getInstance();
		HostImplement host = HostImplement.getInstance();
		GuestImplement guest = GuestImplement.getInstance();
		Shop shop = Shop.getInstance();

		System.out.println("서점 문을 엽니다.");
		while (true) {
			switch (code) {	
			case SHOP_LOGIN:	//code의 초기값 = SHOP_LOGIN으로 프로그램 실행 시 첫 case
				code = shop.selectUser();	//Shop 클래스의 주인, 손님 선택
				break;
			case HOST: // 주인 메뉴
				switch (host.state) { // host.state는 주인의 로그인, 로그아웃 상태
				case HOST_LOGIN:
					code = menu.hostMenu();
					break;
				case HOST_LOGOUT:	//Shop 클래스에서 주인 선택 시 host의 state는 HOST_LOGOUT이 초기값임 
					code = menu.login(HOST);	//이 메서드에서 로그인 성공 시 HOST_LOGIN으로 host의 state가 바뀜
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
			case 0: // 1. 주인 2. 손님 0. 종료에서 0번 입력 시 return으로 Main을 끝냄. 즉 프로그램 끝
				System.out.println("서점 문을 닫습니다.");
				return;
			default:
				code = SHOP_LOGIN; // SHOP_LOGIN 화면에서 입력값이 이상하면 무조건 다시 그 창을 띄워줌
				break;
			}
		}
	}
}
