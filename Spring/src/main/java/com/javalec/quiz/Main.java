package com.javalec.quiz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configuration = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		MyScore myScore = ctx.getBean("myScore", MyScore.class);
		
		myScore.sum();
		myScore.average();
	}
}
