package com.javalec.ex08;

public class _19_PolyArgumentTest2_1 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		Tv18 tv = new Tv18();
		Computer1 com = new Computer1();
		Audio1 aud = new Audio1();
		
		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		b.summary();
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "입니다.");
		

	}
}

class Product1 {
	int price;
	int bonusPoint;
	Product1(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv18 extends Product1 {
	Tv18() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer1 extends Product1 {
	Computer1() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio1 extends Product1 {
	Audio1() {
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer1 {
	int money = 1000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];
	int i = 0;
	
	void buy(Product1 p) {
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
			if (item[j] == null) break;
			sum += item[j].price;
			if(j == i - 1)
				itemList += item[j];
			else
				itemList += item[j] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
