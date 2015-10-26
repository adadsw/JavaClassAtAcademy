package com.brain.ch6;

public interface Lendable {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL = 0;
	abstract void checkOut(String aborrower, String date);
	abstract void checkIn();

}
