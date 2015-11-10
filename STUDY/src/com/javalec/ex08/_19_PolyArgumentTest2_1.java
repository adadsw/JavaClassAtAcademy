package com.javalec.ex08;

import java.util.ArrayList;

public class _19_PolyArgumentTest2_1 {
	public static void main(String[] args) {
		Product tv = new Tv17();
		Product com = new Computer();
		Product aud = new Audio();

		Buyer19 buyer = new Buyer19();

		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(aud);

		buyer.refund(com);
		buyer.refund(com);

		buyer.summary();
	}
}

class Buyer19 {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Product> list = new ArrayList<Product>();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		System.out.println(p + "을(를) 구입하셨습니다.");
	}

	void refund(Product p) {
		if (list.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			list.remove(p);
			System.out.println(p + "을(를) 반품하셨습니다.");
		} else {
			System.out.println(p + "항목이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (Product product : list) {
			sum += product.price;
			itemList += product + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + bonusPoint + "입니다.");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv17 extends Product {
	Tv17() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(300);
	}

	public String toString() {
		return "Audio";
	}
}
