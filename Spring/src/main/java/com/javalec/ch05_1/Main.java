package com.javalec.ch05_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX5_1.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();
	}
}
