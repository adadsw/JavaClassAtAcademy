package com.javalec.ch05_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX5_2.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();

	}
}
