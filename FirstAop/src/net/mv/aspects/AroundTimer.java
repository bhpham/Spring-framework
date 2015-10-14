package net.mv.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundTimer {
	
	@Around("execution(* net.mv.model.Event.* (..))")
	public void timer(ProceedingJoinPoint pjp) throws Throwable{ 
		System.out.println("Before");
		
		pjp.proceed();
	
		System.out.println("After");
		
		
	}

	private void randomSleep() {
		try {
			Thread.sleep((long) (3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
