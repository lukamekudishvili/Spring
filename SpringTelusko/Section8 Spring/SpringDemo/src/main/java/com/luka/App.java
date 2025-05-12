package com.luka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        Alien obj= applicationContext.getBean(Alien.class);
        obj.code();
    }
}
