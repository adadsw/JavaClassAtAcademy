package com.javalec.ex08;

public interface _37_Lendable {
	public static final int STATE_BORROWED = 1;
	public static final int STATE_NORMAL = 0;

	public void checkIn();
	public void checkOut(String borrower, String date);
}
