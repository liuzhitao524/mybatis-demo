package com.hqins.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Pointcut("execution(public String com.hqins.service.UserService.findUser(Integer))")
    private  void anyOldTransfer(){
        logger.info("a point cut\n");
    }


    @Before("anyOldTransfer()")
    public  void doBefore(){
        logger.info("before  method log done");
    }

    @After("execution(public * com.hqins.service..*.*(..))")
    public void doAfter(JoinPoint joinPoint){
        logger.info("after method log done" + joinPoint.getTarget().getClass() +
            " args = "+ Arrays.asList(joinPoint.getArgs()) + ","+
            " method = "+ joinPoint.getSignature());

    }

}
