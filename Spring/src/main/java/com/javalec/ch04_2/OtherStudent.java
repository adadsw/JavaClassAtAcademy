package com.javalec.ch04_2;

import javax.annotation.*;
public class OtherStudent {
	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	// 빈의 생명주기 : 어노테이션 방식
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod()");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destoryMethod()");
	}
} 
