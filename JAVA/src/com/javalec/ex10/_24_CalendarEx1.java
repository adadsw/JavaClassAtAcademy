package com.javalec.ex10;

import java.util.Calendar;

public class _24_CalendarEx1 {
	public static void main(String[] args) {
		// 기본적으로 현재 날짜와 시간이 설정된다.
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1 + "월 ")
				+ (today.get(Calendar.DATE) + "일 " + getDay(today.get(Calendar.DAY_OF_WEEK)) + "요일")); // 2015년 11월 9일 월요일

		System.out.println(today.get(Calendar.HOUR) + ":" + today.get(Calendar.MINUTE) + ":"
				+ today.get(Calendar.SECOND) + " " + (today.get(Calendar.AM_PM) == 0 ? "AM" : "PM")); // 10:51:22 AM

		System.out.println(today.get(Calendar.WEEK_OF_YEAR) + "주/년, " + today.get(Calendar.WEEK_OF_MONTH) + "주/월"); // 46주/년, 2주/월
		System.out.println(today.get(Calendar.DAY_OF_YEAR) + "일/년, " + today.get(Calendar.DAY_OF_MONTH) + "일/월"); // 313일/년, 9일/월
		System.out.println("24hour: " + today.get(Calendar.HOUR_OF_DAY) + "시"); // 24hour: 10시
		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE)); //이 달의 마지막 날: 30

	}

	static String getDay(int i) {
		String day = "";
		switch (i) {
		case 1:
			day = "일";
			break;
		case 2:
			day = "월";
			break;
		case 3:
			day = "화";
			break;
		case 4:
			day = "수";
			break;
		case 5:
			day = "목";
			break;
		case 6:
			day = "금";
			break;
		case 7:
			day = "토";
			break;
		}
		return day;
	}
}