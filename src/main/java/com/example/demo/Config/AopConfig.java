package com.example.demo.Config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AopConfig {

//    @Before(value = "execution(* com.example.demo.Service.*.*(..))")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("===========OnBeforeFindAllUsers============");
//        System.out.println(joinPoint.getTarget().getClass().getName());
//        System.out.println(joinPoint.getSignature().getName());
//    }
//
//    @After(value = "execution(* com.example.demo.Service.*.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("===========OnAfterFindAllUsers============");
//        System.out.println(joinPoint.getTarget().getClass().getName());
//        System.out.println(joinPoint.getSignature().getName());
//    }

//    @Around(value = "execution(* com.example.demo.Service.*.*(..))")
    @Around("@annotation(com.example.demo.Aop.OnBeforeQueryAllEvent)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("===========OnBeforeAroundFindAllUsers============");
        System.out.println(proceedingJoinPoint.getTarget().getClass().getName());
        System.out.println(proceedingJoinPoint.getSignature().getName());
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("===========OnAfterAroundFindAllUsers============");
        return proceed;
    }
}
