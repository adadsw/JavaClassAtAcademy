package com.javalec.ex08;

public interface _28_IFunction {
	public static final String APHONE = "APhone";
	public static final String BPHONE = "BPhone";
	public static final String CPHONE = "CPhone";

	public static final String THREE_G = "3G";
	public static final String FOUR_G = "4G";

	public static final String PCALLYES = "전화송수신 : 가능";
	public static final String PCALLNO = "전화송수신 : 불가능";

	public static final String TVRMT_YES = "TV 리모컨 기능 : 기본 탑재";
	public static final String TVRMT_NO = "TV 리모컨 기능 : 기본 미탑재";

	public String callSenderReceive(); // 전화송수신

	public String calLte(); // 4G

	public String tvRemoteController(); // Tv 리모콘기능
}

// 상수 : 제품명, 4G

// a제품 : 전화송수신 : 가능
// a제품 : 3G
// a제품 : TV 리모콘기능 : 미탑재

// b제품
