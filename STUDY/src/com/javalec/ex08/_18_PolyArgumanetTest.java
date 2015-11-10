package com.javalec.ex08;

public class _18_PolyArgumanetTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv17 tv = new Tv17();
		Computer com = new Computer();
		Audio aud = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}



class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을(를) 구입하셨습니다." );
		
	}
}