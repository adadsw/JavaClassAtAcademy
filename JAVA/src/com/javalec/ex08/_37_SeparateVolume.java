package com.javalec.ex08;

public class _37_SeparateVolume implements _37_Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	_37_SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	@Override
	public void checkIn() {
		this.borrower = null;
		this.state = STATE_NORMAL;
		this.checkOutDate = null;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다. \n");
		
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + date + "\n");
	}

}
