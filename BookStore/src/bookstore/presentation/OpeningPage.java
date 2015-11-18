package bookstore.presentation;

import java.util.Scanner;

import bookstore.Main;
import bookstore.service.Input;

public class OpeningPage {
	public int openStore() {
		System.out.println("서점 문을 엽니다.");
		System.out.println("1. 주인 2. 손님 0. 나가기");
		int code = Integer.parseInt((Input.input()));
		switch (code) {
		case 1:
			code = 1;
			break;
		case 2:
			code = 2;
			break;
		default:
			code = Main.SHOP_LOGIN;
		}
		return code;
	}
}
