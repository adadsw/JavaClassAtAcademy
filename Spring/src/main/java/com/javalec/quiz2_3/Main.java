package com.javalec.quiz2_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configuration = "classpath:applicationCTXquiz2_3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		Car car = ctx.getBean("car", Car.class);
		car.run();
		ctx.close();
	}
}
