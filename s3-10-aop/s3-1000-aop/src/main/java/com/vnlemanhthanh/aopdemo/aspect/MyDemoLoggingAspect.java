package com.vnlemanhthanh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Bean("execution(public void updateAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println(this+ "---->>> Executing @Before advice on method()");
    }
}
