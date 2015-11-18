package bookstore.presentation;

import bookstore.service.*;

public class Host implements BookManagement, OrderManagement, Login {
	public boolean hostLogin = false;
	private final String id = "Host";
	private final String pass = "Host";
	int code;

	public int login() {
		System.out.println("아이디를 입력하여 주십시오.");
		String id = Input.input();
		System.out.println("비밀번호를 입력하여 주십시오.");
		String pass = Input.input();
		if (id == this.id && pass == this.pass || hostLogin == true) {
			hostLogin = true;
			System.out.println("접속하셨습니다.");
			System.out.println("1. 재고관리	2. 주문관리 0. 나가기");
			code = Integer.parseInt((Input.input()));
			switch (code) {
			case 1:
				code = 11;
				break;
			case 2:
				code = 12;
				break;
			case 0:
				code = 1;
				break;
			default:
				System.out.println("다시 입력하여 주십시오.");
				code = 11;
				break;
			}
		} else {
			System.out.println("로그인에 실패했습니다.");
			code = 1;
		}
		return code;
	}

	@Override
	public void listBook() {
		System.out.println("책 리스트입니다.");

	}

	@Override
	public void addBook() {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void modifyBook() {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void deleteBook() {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void listOrder() {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void addOrder() {
		// TODO 자동 생성된 메소드 스텁

	}

	@Override
	public void delterOrder() {
		// TODO 자동 생성된 메소드 스텁

	}

}
