package com.javalec.ch03_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext extends GenericApplicationContext
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
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
