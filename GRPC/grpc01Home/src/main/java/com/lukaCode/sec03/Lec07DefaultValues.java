package com.lukaCode.sec03;

import com.lukaCode.generatedModel.sec03.School;

public class Lec07DefaultValues {
    public static void main(String[] args) {
        var school= School.newBuilder().build();
        System.out.println(school.getName());
    }
}
