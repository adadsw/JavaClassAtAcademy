package com.javalec.ch04_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX4_1.xml"); //설정
		
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		ctx.close();
	}
}
