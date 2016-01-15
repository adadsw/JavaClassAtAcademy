package com.javalec.ch02_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		String configuration = "classpath:applicationCTX2_2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		ctx.close();
	}
}
