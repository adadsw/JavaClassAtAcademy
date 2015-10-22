package com.brain.ch5;

public class ProductInfo {
	int productCode;
	String productName;
	String manufacturer;
	int standardPrice;
	float salePercent;
	
	void changeSP() {
		
	}
	
	ProductInfo(int productCode, String productName, String manufacturer, int standardPrice, float salePercent) {
		this.productCode = productCode;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.salePercent = salePercent;
		this.standardPrice -= salePercent * standardPrice;
		
	}
	ProductInfo(int productCode, String productName, String manufacturer, int standardPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.standardPrice = standardPrice;
	}

}
