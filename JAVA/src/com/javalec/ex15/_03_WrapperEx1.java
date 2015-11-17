package com.javalec.ex15;

import java.util.ArrayList;

public class _03_WrapperEx1 {
	public static void main(String[] args) {
		/*
		 * 프리미티브 타입 : 수치, 문자, 논리값과 같은 간단한 데이터를 표현하는 타입 레퍼런스 타입 : 그 외의 데이터타입
		 * 
		 * 래퍼클래스(wrapper class) : primitive type의 값을 담는 객체를 생성한다. 이 클래스의 객체들은
		 * 프리미티브 타입의 값을 감싸는 (wrap) 역할을 한다. byte => Byte, shoty -> Short, int ->
		 * Integer, long -> Long char -> Character, float -> Float, double ->
		 * Double, boolean -> Boolean 래퍼클래스 사용법 1. 래퍼 클래스로 만든 객체를 래퍼객체라고 하며, 래퍼
		 * 객체에는 하나의 프리미티브 값을 담을 수 있는데, 그 값은 생성자 파라미터로 넘겨줘야 하며, 넘겨진 프리미티브 타입의 값은
		 * 래퍼 객체 안에 저장된다. Integer obj = new Integer(12345); 2. 래퍼클래스의 메서드를 이용해서
		 * 래퍼 객체 안에 있는 프리미티브 타입의 값을 가져오려면 메서드 이름을 해당 프리미티브 타입이름 뒤에 Value를 붙인다.
		 * int num = obj.intValue();
		 * 
		 */
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println(sum);
		sum = obj1 + obj2;
		System.out.println(sum);

		Float obj = new Float(10.5f);
		byte num1 = obj.byteValue();
		short num2 = obj.shortValue();
		int num3 = obj.intValue();
		long num4 = obj.longValue();
		float num5 = obj.floatValue();
		double num6 = obj.doubleValue();
		System.out.println("byte	num1 :" + num1);
		System.out.println("short	num2 :" + num2);
		System.out.println("int 	num3 :" + num3);
		System.out.println("long	num4 :" + num4);
		System.out.println("float	num5 :" + num5);
		System.out.println("double	num6 :" + num6);

		/*
		 * 3. valueOf() 메서드 래퍼클래스의 생성자를 대신하여 사용할 수 있다. 래퍼클래스의 생성자 파라미터에 해당하는 값을
		 * 넘겨주면, 그에 해당하는 래퍼 객체가 리턴된다.
		 */
		Integer obj3 = Integer.valueOf(125);
		System.out.println(obj3);

		Byte obj11 = Byte.valueOf((byte) 1);
		Short obj22 = Short.valueOf((short) 123);
		Integer obj33 = Integer.valueOf(12345);
		Long obj44 = Long.valueOf(1234567890L);
		Float obj55 = Float.valueOf(1.5f);
		Double obj66 = Double.valueOf(1.00005);
		Character obj77 = Character.valueOf('꽃');
		Boolean obj88 = Boolean.valueOf(true);
		System.out.println(obj11);
		System.out.println(obj22);
		System.out.println(obj33);
		System.out.println(obj44);
		System.out.println(obj55);
		System.out.println(obj66);
		System.out.println(obj77);
		System.out.println(obj88);

		/*
		 * 문자열을 프리미티브 타입으로 바꾸는 정적 메서드 : 래퍼클래스의 정적메서드로 파라미터로 받은 문자열을 해석하여 프리미티브
		 * 값으로 만들어서 리턴한다. int num = Integer.parseInt("12345")
		 */

		/*
		 * 자동 Boxing과 자동 Unboxing 박싱 (boxing, 박스에 넣기) : 프리미티브 타입의 값을 래퍼객체로 만드는 것
		 * 언박싱(unboxing, 박스에서 꺼내기) : 래퍼 객체를 프리미티브 타입의 값으로 만드는 것 Integer obj =
		 * new Integer(12000) //Boxing int num = obj.intValue() //Unboxing
		 */

		// 래퍼객체 -> 프리미티브 타입 값으로의 자동 Unboxing

		Integer unboxing = new Integer("10");
		int sumU = unboxing + 20;
		System.out.println(sumU);
		// 프리미티브 타입 값 -> 래퍼 객체로의 자동 Boxing
		printDouble(new Double(123.45));
		printDouble(123.45);
		
		ArrayList list = new ArrayList();
		// 오토박싱 언오토박싱 사용 전
		Integer data1 = new Integer(123);
		list.add(data1);
		Integer data2 = (Integer) list.get(0);
		int num = data2.intValue();
		System.out.println(num);
		
		// 오토박싱 언오토박싱 사용 후
		int data3 = new Integer(543);
		list.add(data3); //객체타입만 add 가능
		int data4 = (int) list.get(1);
		System.out.println(data4);
		
		/*
		 * Generics
		 * 예) ArrayList<E>
		 * 1. 정의 : Collection의 구조적인 문제를 보완하기 위해서 JDK5.0에서 추가된 기능이다.
		 * 			Type을 구체화할 때 사용할 수 있다.
		 * 2. Collection 구조적인 문제
		 * 		1) Collection에는 모든 객체를 저장할 수 있다.
		 * 		이것은 타입이 서로 다른 객체도 저장할 수 있음을 의미한다.
		 * 		저장된 객체를 얻어올 때는 반드시 실제 객체로 Type Casting을 해주어야 한다.
		 * 		Tpye Casting이 잘못되었어도 실행할 때 비로소 알 수 있으므로 가독성과 신뢰성을
		 * 		떨어뜨린다. 따라서  Generics를 활용하여 정확한 자료형을 사용하는 것이 좋다.
		 * 3. 사용방법 
		 * 		1) <>로 표현한다.
		 * 		2) <T> : 전달되는 객체가 현재 클래스에서 자료형(Type)으로 사용될 때
		 * 		   <E> : 전달되는 객체가 현재 클래스에서 요소(Element)로 사용될 때
		 * 		   <K> : 전달되는 객체가 현재 클래스에서 키(Key)값으로 사용될 때
		 * 		   <V> : 전달되는 객체가 현재 클래스에서 값(Value)로 사용될 때
		 */
	}

	private static void printDouble(double d) {
		System.out.println(d);
	}

}
