package com.luka;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("compiling from Desktop");
    }
}
