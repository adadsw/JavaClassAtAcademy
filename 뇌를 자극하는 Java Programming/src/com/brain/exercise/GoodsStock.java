package com.brain.exercise;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	void addStock(int amount) {
		stockNum += amount;
	}

	int subtractStock(int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
	
	GoodsStock(String code, int num) {
		goodsCode = code;
		if (num < 0) {
			num = 0;
		}
		stockNum = num;
	}

}
