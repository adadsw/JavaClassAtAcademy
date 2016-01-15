package com.javalec.ch04_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); //생성
		ctx.load("classpath:applicationCTX4_2.xml");//설정
		ctx.refresh();
		ctx.close();//종료
	}
}
