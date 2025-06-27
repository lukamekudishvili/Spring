package com.lukaCode.sec03;
import com.lukaCode.generatedModel.sec03.BodyStyle;
import com.lukaCode.generatedModel.sec03.Car;
import com.lukaCode.generatedModel.sec03.Dealer;

public class Lec06Map {
    public static void main(String[] args) {
        var car1= Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2000).build();

        var car2= Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2002).build();
        var dealer=Dealer.newBuilder()
                .putInventory(car1.getYear(),car1).putInventory(car2.getYear(), car2).build();
        System.out.println(car1.getBodyStyle() );

    }
}
