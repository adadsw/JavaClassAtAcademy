package com.javalec.ex08;

public class _19_PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer18 b = new Buyer18();
		Tv17 tv = new Tv17();
		Computer com = new Computer();
		Audio aud = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		b.summary();

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

	}
}

class Buyer18 {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을(를) 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int j = 0; j < item.length; j++) {
			if (item[j] == null)
				break;
			sum += item[j].price;
			if (j == i - 1)
				itemList += item[j];
			else
				itemList += item[j] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}