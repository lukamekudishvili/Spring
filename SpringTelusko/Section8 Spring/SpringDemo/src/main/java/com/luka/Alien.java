package com.luka;

public class Alien {

    private int age;
    private int salary;
    private Computer computer;

    public Alien(){
        System.out.println("Alien object created!");
    }
    public Alien(Computer computer){
        System.out.println("Alien object created from comp parameter constructor");
        this.computer=computer;
    }

    public Alien(int age, int salary, Computer computer) {
        System.out.println("called constructor");
        this.age = age;
        this.salary=salary;
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getLaptop() {
        return computer;
    }

    public void setLaptop(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Coding");
        computer.compile();
    }
}
