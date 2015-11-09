package com.javalec.ex10;

import java.util.Calendar;

public class _28_CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2005, 0, 31);
		System.out.println(_27_CalendarEx4.toString(date));
		//roll()은 다른 필드에 영향을 미치지 않는다..
		//roll()은 날짜 필드별로 조정하지만, 일 필드가 말일일 때 월 필드 변화가 일 필드에 영향을 미치기도 한다.
		//예 )add메서드로 날짜필드의 값을 31만큼 증가시켰다면, 다음 달로 넘어가므로 월필드의 값도 1 증가하지만,
		//roll메서드는 같은 경우에 월필드의 값은 변하지 않고, 일필드의 값만 바뀐다.
		date.roll(Calendar.MONTH, 1);
		System.out.println(_27_CalendarEx4.toString(date));
	}

}
