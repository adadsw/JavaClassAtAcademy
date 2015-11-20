package bookstore.service;

import static bookstore.domain.CODE.GUEST;
import static bookstore.domain.CODE.HOST;
import static bookstore.domain.CODE.SHOP_LOGIN;

import bookstore.presentation.Console;

public class Shop {
	int code;
	private static Shop shop = new Shop();

	private Shop() {
	}

	public static Shop getInstance() {
		return shop;
	}
	public int selectUser() {
		System.out.println("1: 주인, 2: 손님, 0: 나가기");
		try {
			code = Integer.parseInt(Console.input());
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력하여 주십시오.");
			return SHOP_LOGIN;
		}
		switch (code) {
		case 1:
			code = HOST;
			break;
		case 2:
			code = GUEST;
			break;
		case 0:
			code = 0;
			break;
		default:
			code = SHOP_LOGIN;
		}
		return code;
	}
}
