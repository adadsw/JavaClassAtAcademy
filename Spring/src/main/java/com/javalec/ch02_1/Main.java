package com.javalec.ch02_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
/*		MyCalculator myCalculator = new MyCalculator();
		
		myCalculator.setCalculator(new Calculator());
		myCalculator.setFirstNum(20);
		myCalculator.setSecondNum(10);*/
		
		String configuration = "classpath:applicationCTX2_1.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		
		ctx.close();
	}
}
