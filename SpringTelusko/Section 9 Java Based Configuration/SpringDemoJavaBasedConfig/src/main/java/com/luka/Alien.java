package com.luka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private int age;

    private Computer computer;

    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    @Autowired

    public Alien(@Qualifier(value = "desktop") Computer computer) {
        this.computer = computer;
    }

    public Alien() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        computer.compile();
        System.out.println("Alien is coding!!!");
    }
}
