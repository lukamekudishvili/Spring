package com.luka.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    //this is where we add all of our related advices for logging

    //@Before("execution(public void addAccount())") if we want to have aspect all addAccount() methods in all classes
    //@Before("execution(public void updateAccount())")

    //@Before("execution(public void com.luka.aopdemo.DAO.AccountDAO.addAccount())") // if we want to have aspect only the certain class's methods
//    @Before("execution(public void add*())") if we want to have aspect on any class's any method that starts with add...

//    @Before("execution(public * add*())") //any return type and any method in any class that starts with word add...

    //@Before("execution(public * add*(com.luka.aopdemo.model.Account))") // aspect to method with any return type, name starts with add and has parameter of Account type

//    @Before("execution(public * add*(com.luka.aopdemo.model.Account, ..))")// aspect to method with any return type, name starts with add and has parameter of Account type and then any number of any types
//    @Before("execution(public * add*(..))") 0 or any type argument of any count

    @Before("execution(* com.luka.aopdemo.DAO.*.*(..))")// com.luka.aopdemo.DAO in tyhat package any return type method with parameters or without
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advice on method() ");
    }
}
