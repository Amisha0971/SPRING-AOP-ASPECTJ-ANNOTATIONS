package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.service.BankService.withdraw(..))")
    public void logBeforeWithdraw() {
        System.out.println("[@Before] Logging BEFORE withdrawal...");
    }

    @AfterReturning(value = "execution(* com.example.service.BankService.deposit(..))", returning = "amount")
    public void logAfterReturning(int amount) {
        System.out.println("[@AfterReturning] Deposit successful! Deposited: " + amount);
    }

    @AfterThrowing(value = "execution(* com.example.service.BankService.throwException(..))", throwing = "ex")
    public void logAfterThrowing(Exception ex) {
        System.out.println("[@AfterThrowing] Exception caught: " + ex.getMessage());
    }

    @After("execution(* com.example.service.BankService.checkBalance(..))")
    public void logAfter() {
        System.out.println("[@After] Checking balance completed.");
    }

    @Around("execution(* com.example.service.BankService.withdraw(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[@Around] Before executing withdraw...");
        Object result = joinPoint.proceed();
        System.out.println("[@Around] After executing withdraw...");
        return result;
    }
}
