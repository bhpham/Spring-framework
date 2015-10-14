package net.mv.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AudienceLogger {

//	@Before("execution(* net.mv.model.Event.* (..))")
//	public void beforeEvent(){
//		System.out.println("Audience buy tickets");
//		System.out.println("Audience sits down and turns off phones");
//		/*Sleep thread for random period so as to vary service execution time*/
////		randomSleep();
//	}
//	
//	@AfterReturning("execution(* net.mv.model.Event.* (..))")
//	public void goodPerformance(){
//		System.out.println("Cheers");
//	}
//	
//	@AfterThrowing("execution(* net.mv.model.Event.* (..))")
//	public void badPerformance() {
//		System.out.println("Throw tomatoes at performance");
//	}
//	
//	@After("execution(* net.mv.model.Event.* (..))")	
//	public static void afterEvent() {
//		System.out.println("Audience goes home");
//
//		/*Sleep thread for random period so as to vary service execution time*/
////		randomSleep();
//		
//	}
//	
//	private void randomSleep() {
//		try {
//			Thread.sleep((long) (Math.random() * 1000));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
}
