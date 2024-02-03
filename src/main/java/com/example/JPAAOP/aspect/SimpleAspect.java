package com.example.JPAAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// Annotate with Aspect to mark it as aspect.
@Aspect
// Annotate with @Component to create bean of this class
@Component
public class SimpleAspect {

    private static Logger LOGGER = LoggerFactory.getLogger(SimpleAspect.class);

    // Marking this method with @Before annotation tells the program to execute this method before the method in expression is executed.
    // We need to specify expression to this annotation inorder to tell the program this method needs to be executed before the method mentioned in the expression.
    @Before("execution(* com.example.JPAAOP.service.AOPService.getData(..))")
    public void beforeMethod()
    {
        LOGGER.info("Executing beforeMethod.");
    }

    @After("execution(* com.example.JPAAOP.service.AOPService.getData(..))")
    public void afterMethod()
    {
        LOGGER.info("Executing afterMethod.");
    }

    @Around("@annotation(com.example.JPAAOP.aspect.LogExecutionTime)")
    public Object executionLogTime(ProceedingJoinPoint point) throws Throwable{
        // before method
        long start = System.currentTimeMillis();
        // actual method
        Object result = point.proceed();
        // after method
        long end = System.currentTimeMillis();
        long totalTimeTaken = end - start;
        LOGGER.info("Execution time {} ms",totalTimeTaken);
        return result;
    }
}
