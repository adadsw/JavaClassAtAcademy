package com.javalec.ex08;

public class _37_appCDInfo extends _37_CDInfo implements _37_Lendable {
	String borrower;
	String checkOutDate;
	byte state;
	_37_appCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("*" + title + " 이(가) 반납되었습니다.\n");
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + title + " CD가 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

}
