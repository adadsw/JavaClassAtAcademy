package com.javalec.ch02_1복습;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ch02_1.MyCalculator;

public class Main {
	public static void main(String[] args) {
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
