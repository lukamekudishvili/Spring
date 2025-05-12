package com.luka;

import com.luka.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.SysexMessage;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop=(Desktop) ctx.getBean(Desktop.class);
        System.out.println(System.identityHashCode(desktop));
        Desktop desktop1=ctx.getBean(Desktop.class);
        System.out.println(System.identityHashCode(desktop1));

        Alien alien=ctx.getBean(Alien.class);
        alien.code();
    }
}
