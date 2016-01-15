package com.javalec.ch05_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(com.javalec.ch05_2.*)")
	private void pointcutMethod(){}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString(); 
		System.out.println(signatureStr + "is start.");
		long st = System.currentTimeMillis(); 
		Object obj = null;
		try {
			obj = joinpoint.proceed();
		} catch (Exception e) {
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished");
			System.out.println(signatureStr + "경과시간 : " + (et - st));
		}
		return obj;
	}
}
