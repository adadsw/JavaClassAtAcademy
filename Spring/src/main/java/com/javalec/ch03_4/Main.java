package com.javalec.ch03_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javalec.ch03_4.ApplicationConfig;

public class Main {
	public static void main(String[] args) {
		
		// JAVA 파일에 XML파일을 포함시켜 사용하는 예제
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

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
