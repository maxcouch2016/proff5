package action14_spring2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ResourceAction {
	@Pointcut("execution(* action14_spring2.Perform.perform(..))")
	public void perfomance1(){
	}
	
	@Before("perfomance1()")
	public void open(){
		System.out.println("Before: open resource");
	}
	@After("perfomance1()")
	public void close(){
		System.out.println("After: close resource");
	}	
}
