package com.javalec.ex08;

import java.util.ArrayList;

public class _19_PolyArgumentTest2_ArrayList {
	public static void main(String[] args) {
		Product5 tv = new Tv19();
		Product5 com = new Computer2();
		Product5 aud = new Audio2();

		Buyer19 buyer = new Buyer19();

		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(aud);

		buyer.refund(com);

		buyer.summary();
	}
}

class Buyer19 {
		int money = 1000;
		int bonusPoint = 0;
		ArrayList<Product5> list = new ArrayList<Product5>();
		int i = 0;
		
		void buy(Product5 p) {
			if (money < p.price) {
				System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
				return;
			}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			list.add(p);
			System.out.println(p + "을(를) 구입하셨습니다.");
		}
		void refund(Product5 p) {
			if (list.indexOf(p) == -1) {
				System.out.println("해당 항목이 없습니다.");
				return;
			}
			money += p.price;
			bonusPoint -= p.bonusPoint;
			list.remove(p);
			System.out.println(p + "을(를) 환불하셨습니다.");
		}
		void summary() {
			int sum = 0;
			String itemList = "";
			
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i) == null) break;
				sum += (list.get(i)).price;
				itemList += list.get(i) + ", ";
			}
			System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
			System.out.println("구입하신 제품은 " + itemList + "입니다.");
			
			System.out.println("현재 남은 돈은 " + money + "만원입니다.");
			System.out.println("현재 보너스점수는 " + bonusPoint + "입니다."); 
		}
}

class Product5 {
	int price;
	int bonusPoint;
	Product5(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv19 extends Product5 {
	Tv19() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product5 {
	Computer2() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product5 {
	Audio2() {
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}
