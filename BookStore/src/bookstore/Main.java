/*
 * bookstore : Main.java
 * 
 * bookstore.domain : 객체
 * 			 Book.java .. 책정보
 * 
 * 			 CODE.java interface	//주인과 손님의 메뉴
 * 					//주인
 * 					int HOST = 1;
 * 					int HOST_BOOK = 110;		//재고관리
 * 					int HOST_BOOL_LIST = 111;	//책목록
 * 
 * 					//손님
 * 					int GUEST = 2;
 * 					int GUEST_ORDER = 210;	//쇼핑
 * 			 Order.java ..주문정보 .. 멤버변수, 생성자, 메서드
 * 			 Shelf.java ..책꽂이정보
 * bookstore.service
 * 		Guest.java ..인터페이스
 * 		GuestImpl.java .. 구현
 * 		Host.java .. 인터페이스
 * 		HostImpl.java .. 구현
 * 		Shop.java Guest, Host
 * bookstore.presentation : 화면
 * 				Console.java
 * 				Menu.java
 * 				MenuImplement.java
 */

package bookstore;

import java.util.Scanner;
import bookstore.presentation.*;

public class Main {
	public static final int SHOP_LOGIN = 999;
	public static final int HOST_BOOK_LIST = 111;
	public static final int HOST_BOOK_ADD = 112;
	public static final int HOST_BOOK_UPDATE = 113;
	public static final int HOST_BOOK_DEL = 114;
	public static final int HOST_ORDER_LIST = 121;
	public static final int HOST_ORDER_ADD = 122;
	public static final int HOST_ORDER_DEL = 123;
	public static final int GUEST_ORDER_ADD = 211;
	public static final int GUEST_ORDER_DEL = 212;

	public static void main(String[] args) {
		int code = SHOP_LOGIN;
		OpeningPage open = new OpeningPage();
		Host host = new Host();
		Guest guest = new Guest();

		while (true) {
			switch (code) {
			case SHOP_LOGIN:
				/*
				 * switch (host.hostLogin) { case true: break; case false:
				 * break; }
				 */
				code = open.openStore();
				break;
			case 1: // 주인
				host.login();
				break;
			case 11: //재고관리
			
			case HOST_BOOK_LIST: // 책 목록

			case HOST_BOOK_ADD: // 책 추가

			case HOST_BOOK_UPDATE: // 책 수정

			case HOST_BOOK_DEL: // 책 삭제

			case 12: //주문관리
				
			case HOST_ORDER_LIST: // 주문 목록

			case HOST_ORDER_ADD: // 주문 추가

			case HOST_ORDER_DEL: // 주문 삭제

			case 2: // 손님
				guest.login();
				break;
			case 21:
			case GUEST_ORDER_ADD: // 구매

			case GUEST_ORDER_DEL: // 환불
				
			default:
				code = 0;
				break;
			}
		}
	}
}
