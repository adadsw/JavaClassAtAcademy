package com.javalec.ch03_1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * @Configuration : '이 클래스는 스프링설정에 사용되는 클래스이다'라고 명시해주는 어노테이션
 * @Bean : '객체생성'이라고 명시해주는 어노테이션 
 * 			class Student student1(){} : class 클래스타입 + 참조변수명
 */


@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() { //ctx.getBean("student1", student.class);
								//ctx.getBean("Bean ID", 클래스 타입);		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("승마");
		hobbies.add("수영");
		hobbies.add("영화감상");
		
		Student student = new Student("장동건", 30, hobbies);	// 생성자를 이용한 DI(의존주입)
		student.setHeight(182);	// set을 이용한 DI(의존주입)
		student.setWeight(68);	// set을 이용한 DI(의존주입)
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("컴퓨터");
		hobbies.add("게임");
		hobbies.add("잠");
		Student student = new Student("오승현", 27, hobbies);
		student.setHeight(170);
		student.setWeight(63);
		return student;
	}
}
