package net.mv.performance;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

/*
 * @Aspect tells the Spring framework that this class contains advice that should
 * be applied to one or more specified Pointcuts at runtime
 */
@Aspect
public class PerformanceMonitor
{
	private final String MONITOR = "PERFORMANCE_MONITOR";
	private Monitor monitor_i;

	/*
	 * @Before tells the Spring framework that this method should be invoked before the specified Pointcut.
	 * The Pointcut expression here is identical to the one we used in the XML configuration example
	 */
	@Before("execution(* net.mv.model.Event.* (..))")
	public void startMonitor()
	{
		monitor_i = MonitorFactory.start(MONITOR);
	}

	/*
	 * @After tells the Spring framework that this method should be invoked after the specified Pointcut.
	 * The Pointcut expression here is identical to the one we used in the XML configuration example
	 */
	@After("execution(* net.mv.model.Event.* (..))")
	public void stopMonitor()
	{
		monitor_i.stop();
	}

	/**
	 * get last access
	 *
	 * @return Date
	 */
	public Date getLastAccess()
	{
		return monitor_i.getLastAccess();
	}

	/**
	 * get call count
	 *
	 * @return int
	 */
	public int getCallCount()
	{
		return (int) monitor_i.getHits();
	}

	/**
	 * get average call time
	 *
	 * @return double
	 */
	public double getAverageCallTime()
	{
		return monitor_i.getAvg() / 1000;
	}

	/**
	 * get last call time
	 *
	 * @return double
	 */
	public double getLastCallTime()
	{
		return monitor_i.getLastValue() / 1000;
	}

	/**
	 * get maximum call time
	 *
	 * @return double
	 */
	public double getMaximumCallTime()
	{
		return monitor_i.getMax() / 1000;
	}

	/**
	 * get minimum call time
	 *
	 * @return double
	 */
	public double getMinimumCallTime()
	{
		return monitor_i.getMin() / 1000;
	}

	/**
	 * get total call time
	 *
	 * @return double
	 */
	public double getTotalCallTime()
	{
		return monitor_i.getTotal() / 1000;
	}

	/*
	 * @After tells the Spring framework that this method should be invoked after the specified Pointcut.
	 * The Pointcut expression here is identical to the one we used in the XML configuration example
	 */
	@After("execution(* net.mv.model.Event.* (..))")
	public void log(JoinPoint joinPoint_p)
	{
		StringBuffer sb = new StringBuffer();

		sb.append("\n");
		sb.append("*======================================");
		sb.append("\n");
		sb.append("*       PERFORMANCE STATISTICS        *");
		sb.append("\n");
		sb.append("*======================================");
		sb.append("\n");
		sb.append("*  Method Name: " + joinPoint_p.getSignature().getName());
		sb.append("\n");
		sb.append("*  Execution Date: ").append(this.getLastAccess());
		sb.append("\n");
		sb.append("*  Last Execution Time: ").append(this.getLastCallTime()).append(" sec");
		sb.append("\n");
		sb.append("*  Service Calls: ").append(((this.getCallCount())));
		sb.append("\n");
		sb.append("*  Avg Execution Time: ").append(this.getAverageCallTime()).append(" sec");
		sb.append("\n");
		sb.append("*  Total Execution TIme: ").append(this.getTotalCallTime()).append(" sec");
		sb.append("\n");
		sb.append("*  Min Execution Time: ").append(this.getMinimumCallTime()).append(" sec");
		sb.append("\n");
		sb.append("*  Max Execution Time: ").append(this.getMaximumCallTime()).append(" sec");
		sb.append("\n");
		sb.append("*======================================");

		//logger_c.info(sb.toString());
		System.out.println(sb.toString());
	}
}