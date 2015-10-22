package com.javalec.ex07;

class Car {
	String color;
	String gearType;
	int door;
	String brand;
	String madeYear;
	String madeIn;
	int price;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	Car(String brand, String madeYear, String madeIn, int price) {
		this.brand = brand;
		this.madeYear = madeYear;
		this.madeIn = madeIn;
		this.price = price;
	}
}

public class _17_CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		Car c2 = new Car("white", "auto", 4);
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door); 
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door); 

		Car c3 = new Car("벤츠", "2016", "Germany", 150000);
		System.out.println(" 브랜드 : " + c3.brand + "\n 생산년도 : " + c3.madeYear + "\n 생산국 : " + c3.madeIn + "\n 가격 : " + c3.price);
	}

}
