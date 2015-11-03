package com.javalec.ex08;

public class _37_InterfaceExample2 {
	public static void main(String[] args) {
		_37_Lendable arr[] = new _37_Lendable[3];
		arr[0] = new _37_SeparateVolume("883ㅇ", "푸코의 진자", "에코");
		arr[1] = new _37_SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new _37_appCDInfo("02-17", "XML을 위한 자바 프로그래밍");
		checkOutAll(arr, "오승현", "20151103");
		
		
	}
	
	static void checkOutAll(_37_Lendable arr[], String borrower, String date) {
		for(int cnt = 0; cnt < arr.length; cnt++)
			arr[cnt].checkOut(borrower, date);
	}

}
