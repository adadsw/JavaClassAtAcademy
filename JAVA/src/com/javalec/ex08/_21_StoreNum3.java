package com.javalec.ex08;

public class _21_StoreNum3 extends _21_HeadQuarterStore {

	@Override
	public void orderKimChijjige() {
		System.out.println("김치찌개는 6,000원 입니다.");

	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("부대찌개는 7,000원 입니다.");

	}

	@Override
	public void orderBiBimbap() {
		System.out.println("비빔밥은 7,000원 입니다.");

	}

	@Override
	public void orderSunDaeguk() {
		System.out.println("순대국은 6,000원 입니다.");

	}

	@Override
	public void orderGongGibab() {
		System.out.println("공기밥은 1,000원 입니다.");

	}

	public String toString() {
		return "금융가 매장";
	}

}
