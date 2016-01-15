package com.javalec.ch02_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configuration = "classpath:applicationCTX2_3.xml";

		// IOC 스프링 컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);

		// DI를 통한 의존처리 : xml에서 생성한 의존객체를 전달받는다.
		// ctx.getBean(Bean id명, 클래스타입..패키지.클래스명)
		// Java파일의 수정 없이 스프링 설정파일의 class명만을 수정하여 부품들을 생성/조립할 수 있다. (의존 객체 변경의 유연함)
		// 규모가 커지고 추후 유지보수 업무가 발생시에는 DI장점이 부각된다.
		// getBean 타입을 인터페이스명.class로 통일시키고, 리턴타입도 하나의 인터페이스명으로 리턴받아 통일한다.
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();

		ctx.close();
	}
}
