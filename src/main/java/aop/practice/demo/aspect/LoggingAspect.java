package aop.practice.demo.aspect;


import aop.practice.demo.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
//        System.out.println(joinPoint.getTarget());
    }

//    @AfterReturning("args(name)")
//    public void stringArgumentMethods(String name ){
//        System.out.println("a method that take String arg has been called. The vlaue: " + name);
//    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void stringArgumentMethods(String name, RuntimeException ex){
        System.out.println("a method that take String arg has been called with Exception. The vlaue: " + name + "exception is " + ex);
    }


    @AfterReturning(pointcut = "args(name)", returning ="returnString")
    public void stringArgumentMethods(String name, String returnString ){
        System.out.println("a method that take String arg has been called. The vlaue: " + name + " The return value is: " + returnString);
    }

    @Pointcut("execution(* get*(..))")
    public void allGetters(){}

    @Pointcut("within(aop.practice.demo.model.Circle)")
    public void allCircleMethods(){}


}

//        Circle circle = (Circle) joinPoint.getTarget();

//    @Before("allGetters()")
//    public void secondLoggingAdvice(){
//        System.out.println("Second Advice run");
//    }

//@Pointcut("within(aop.practice.demo.model..*)")
//@Before("execution(public * aop.practice.demo.model.Circle.*get*(..))")
//@Before("execution(public * get*(..))")
//@Before("execution(public * get*(*))")
//@Before("execution(public * get*())")
//@Before("execution(public String getName())")