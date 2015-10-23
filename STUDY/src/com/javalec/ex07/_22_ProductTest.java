package com.javalec.ex07;

class Product {
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product(){}

}

public class _22_ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println("the number of pieces :" + Product.count );
	}
}

