package com.javalec.ch04_2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	// 빈의 생명주기 : implements 방식
	@Override
	public void afterPropertiesSet() throws Exception {
		//implements InitializingBean 했을 때 재정의하며, 빈 초기화과정(ctx.refresh())에서 호출된다.
		System.out.println("afterPropertiesSet()");
	}
	
	@Override
	public void destroy() throws Exception {
		//implements DisposableBean 했을 때 재정의하며, 빈 소멸과정(ctx.close())에서 
		System.out.println("destory()");
	}
}
