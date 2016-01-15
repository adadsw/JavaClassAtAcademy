package com.javalec.ch05_1;

import org.aspectj.lang.ProceedingJoinPoint;

// 프록시 기능(대행)
// 공통기능 클래스 - Advice 역할 클래스 
public class LogAop {

	// 공통기능 메서드 - Advice 역할 메서드
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString(); // joinpoint 메서드명 출력
		System.out.println(signatureStr + "is start.");
		long st = System.currentTimeMillis(); // 공통기능 실행 : 핵심기능 메서드기능의 시작시점 출력
		Object obj = null;
		try {
			// 핵심기능 실행..Student.getStudentInfo() / Worker.getWorkerInfo()
			obj = joinpoint.proceed(); // 핵심기능 실행
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished"); // 공통기능 실행 : 핵심기능 메서드의 종료시점 출력
			System.out.println(signatureStr + "경과시간 : " + (et - st));
		}
		return obj;
	}
}
