package aop.practice.demo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods() && allGetters()")
    public void loggingAdvice(){
        System.out.println("Advice run . Get Method called");
    }

    @Before("allGetters()")
    public void secondLoggingAdvice(){
        System.out.println("Second Advice run");
    }

    @Pointcut("execution(* get*(..))")
    public void allGetters(){}

    @Pointcut("within(aop.practice.demo.model.Circle)")
    public void allCircleMethods(){}


}
//@Pointcut("within(aop.practice.demo.model..*)")
//@Before("execution(public * aop.practice.demo.model.Circle.*get*(..))")
//@Before("execution(public * get*(..))")
//@Before("execution(public * get*(*))")
//@Before("execution(public * get*())")
//@Before("execution(public String getName())")