package com.javalec.ch03_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		// Xml 파일에 JAVA 파일을 포함시켜 사용하는 예제
		
		String configLocation = "classpath:applicationCTX3_3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		Student student = ctx.getBean("student1", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getHobbies());
		System.out.println(student.getHeight());
		System.out.println(student.getWeight());
		System.out.println();
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbies());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		ctx.close();
	}

}
