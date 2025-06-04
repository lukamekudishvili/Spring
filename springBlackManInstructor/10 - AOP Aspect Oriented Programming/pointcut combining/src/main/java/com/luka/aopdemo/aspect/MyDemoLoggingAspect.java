package com.luka.aopdemo.aspect;

import com.luka.aopdemo.model.Account;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.luka.aopdemo.DAO.*.*(..))")
    public void pointcutForDaoPackage() {}

    @Pointcut("execution(* com.luka.aopdemo.DAO.*.get*(..))")
    public void pointcutForGetter() {}

    @Pointcut("execution(* com.luka.aopdemo.DAO.*.set*(..))")
    public void pointcutForSetter() {}

//    @Before("pointcutForDaoPackage()")
//    public void beforeAddAccountAdvice() {
//
//        System.out.println("\n=====>>> Executing @Before advice on method() ");
//    }

    @Before("pointcutForDaoPackage() && !(pointcutForGetter() || pointcutForSetter())")
    public void performApiAnalytics(){
        System.out.println("\n=====>>> Performing Api Analytics on method() ");
    }
}
