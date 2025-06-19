package com.lukaCode.sec04;

import com.lukaCode.generatedModel.sec04.Person;
import com.lukaCode.generatedModel.sec04.common.Address;
import com.lukaCode.generatedModel.sec04.common.BodyStyle;
import com.lukaCode.generatedModel.sec04.common.Car;

public class Lec01Import {
    public static void main(String[] args) {
        var address= Address.newBuilder().setCity("Atlanta").setStreet("Avlabari").build();
        var car=
                Car.newBuilder()
                        .setMake("Mercedes-benz")
                        .setModel("W211 E class")
                        .setYear(2006)
                        .setBodyStyle(BodyStyle.SEDAN)
                        .build();

        var person= Person.newBuilder().setAddress(address).setCar(car).setAge(21).setName("Luka").build();
        System.out.println(person);
    }
}
