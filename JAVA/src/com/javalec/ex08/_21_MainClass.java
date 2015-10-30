package com.javalec.ex08;

public class _21_MainClass {
	public static void main(String[] args) {
		_21_HeadQuarterStore[] store = new _21_HeadQuarterStore[3];
		
		store[0] = new _21_StoreNum1();
		store[1] = new _21_StoreNum2();
		store[2] = new _21_StoreNum3();
		
		for(int i = 0; i < store.length; i++) {
			System.out.println(store[i] + "의 메뉴");
			store[i].orderKimChijjige();
			store[i].orderBuDaejjige();
			store[i].orderBiBimbap();
			store[i].orderSunDaeguk();
			store[i].orderGongGibab();
			System.out.println("---------------------------");
		}
	}
}
