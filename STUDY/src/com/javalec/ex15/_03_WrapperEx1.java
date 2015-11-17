package com.javalec.ex15;

import java.util.ArrayList;

public class _03_WrapperEx1 {
	public static void main(String[] args) {
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
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		Integer obj3 = Integer.valueOf(125);
		System.out.println(obj3);
		
		Byte obj11 = Byte.valueOf((byte)1);
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
		
		Integer unboxing = new Integer("10");
		int sumU = unboxing + 20;
		System.out.println(sumU);
		
		printDouble(new Double(123.45));
		printDouble(123.45);
		
		ArrayList list = new ArrayList();
		
		Integer data1 = new Integer(123);
		list.add(data1)	;
		Integer data2 = (Integer) list.get(0);
		int num = data2.intValue();
		System.out.println(num);
		
		int data3 = new Integer(543);
		list.add(data3);
		int data4 = (int) list.get(1);
		System.out.println(data4);
	}
	private static void printDouble(double d) {
		System.out.println(d);
	}
}
