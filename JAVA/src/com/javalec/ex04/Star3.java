package com.javalec.ex04;

public class Star3 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			if(i<=5){
				for(int j=1;j<=9;j++){
					if(j<=5-i || j>=i+5){
						System.out.print(" ");
						
					}else{
						System.out.print("*");
					}
				}
			} else {
				for(int j=9;j>=1;j--){
					if(j>=9-(i-6) || j<=i-5){
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
