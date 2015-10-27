package com.javalec.ex07;

public class _11_MainClass {
	public static void main(String[] args) {

		_11_StoreNum1 store1 = new _11_StoreNum1();
		store1.orderKimChijjige();
		store1.orderBuDaejjige();
		store1.orderBiBimbap();
		store1.orderSunDaeguk();
		store1.orderGongGibap();

		System.out.println("============================");

		_11_StoreNum2 store2 = new _11_StoreNum2();
		store2.orderKimChijjige();
		store2.orderBuDaejjige();
		store2.orderBiBimbap();
		store2.orderSunDaeguk();
		store2.orderGongGibap();

		System.out.println("=============================");

		_11_StoreNum3 store3 = new _11_StoreNum3();
		store3.orderKimChijjige();
		store3.orderBuDaejjige();
		store3.orderBiBimbap();
		store3.orderSunDaeguk();
		store3.orderGongGibap();
	}
}

class _11_HeadQuarterStore {
	void orderKimChijjige() {
		System.out.println("5,000원 입니다.");
	}

	void orderBuDaejjige() {
		System.out.println("6,000원 입니다.");
	}

	void orderBiBimbap() {
		System.out.println("6,000원 입니다.");
	}

	void orderSunDaeguk() {
		System.out.println("5,000원 입니다.");
	}

	void orderGongGibap() {
		System.out.println("1,000원 입니다.");
	}
}

class _11_StoreNum1 extends _11_HeadQuarterStore {
	@Override
	void orderKimChijjige() {
		System.out.println("4,500원 입니다.");
	}
	@Override
	void orderBuDaejjige() {
		System.out.println("5,000원 입니다.");
	}
	@Override
	void orderBiBimbap() {
		System.out.println("6,000원 입니다.");
	}
	@Override
	void orderSunDaeguk() {
		System.out.println("판매하지 않습니다.");
	}
	@Override
	void orderGongGibap() {
		System.out.println("1,000원 입니다.");
	}
	
}

class _11_StoreNum2 extends _11_HeadQuarterStore {
	@Override
	void orderKimChijjige() {
		System.out.println("5,000원 입니다.");
	}
	@Override
	void orderBuDaejjige() {
		System.out.println("5,000원 입니다.");
	}
	@Override
	void orderBiBimbap() {
		System.out.println("5,000원 입니다.");
	}
	@Override
	void orderSunDaeguk() {
		System.out.println("4,000원 입니다.");
	}
	@Override
	void orderGongGibap() {
		System.out.println("무료입니다.");
	}
}

class _11_StoreNum3 extends _11_HeadQuarterStore {
	@Override
	void orderKimChijjige() {
		System.out.println("6,000원 입니다.");
	}
	@Override
	void orderBuDaejjige() {
		System.out.println("7,000원 입니다.");
	}
	@Override
	void orderBiBimbap() {
		System.out.println("7,000원 입니다.");
	}
	@Override
	void orderSunDaeguk() {
		System.out.println("6,000원 입니다.");
	}
	@Override
	void orderGongGibap() {
		System.out.println("1,000원 입니다.");
	}
}