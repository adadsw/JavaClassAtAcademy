package com.brain.ch6;

public class CheckingTrafficCardAccount extends CheckingAccount {

	CheckingTrafficCardAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance, cardNo);
	}

	boolean hasTrafficCard;

	int payTrafficCard(String cardNo, int amount) throws Exception {
		if (!hasTrafficCard)
			throw new Exception("교통카드로 등록되어 있지 않습니다.");
		return pay(cardNo, amount);
	}

}
