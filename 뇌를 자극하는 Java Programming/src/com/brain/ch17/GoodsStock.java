package com.brain.ch17;

public class GoodsStock implements java.io.Serializable {
	String code;
	int num;
	GoodsStock(String code, int num) {
		this.code = code;
		this.num = num;
	}
	void addStock(int num) {
		this.num += num;
	}
	int subtractStock(int num) throws Exception {
		if (this.num < num)
			throw new Exception("재고가 부족합니다.");
		this.num -= num;
		return num;
	}

}
