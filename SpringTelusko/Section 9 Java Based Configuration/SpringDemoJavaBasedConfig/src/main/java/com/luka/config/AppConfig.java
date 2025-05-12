package com.luka.config;

import com.luka.Alien;
import com.luka.Computer;
import com.luka.Desktop;
import com.luka.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.luka")
public class AppConfig {

//    @Bean
//    @Scope(value="singleton")
//    @Primary
//    public Computer getDesktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Computer getLaptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    public Alien alien(@Autowired @Qualifier("getLaptop") Computer computer){
//        return new Alien(computer);
//    }

}
