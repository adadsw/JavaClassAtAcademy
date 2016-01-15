package com.javalec.ch02_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configuration = "classpath:applicationCTX2_4.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo.getStudentInfo();
		
		studentInfo.setStudent(ctx.getBean("student2", Student.class));
		
		studentInfo.getStudentInfo();
		
		ctx.close();
	}
}
