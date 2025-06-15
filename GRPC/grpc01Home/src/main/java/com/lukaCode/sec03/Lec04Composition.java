package com.lukaCode.sec03;
import com.lukaCode.generatedModel.sec03.Address;
import com.lukaCode.generatedModel.sec03.Student;
import com.lukaCode.generatedModel.sec03.School;
public class Lec04Composition {
    public static void main(String[] args){
        var address= Address.newBuilder().setStreet("123 main st")
                .setCity("Atlanta")
                .setState("GA").build();
        var student= Student.newBuilder()
                .setName("Luka")
                .setAddress(address).build();

        var school =School.newBuilder()
                .setId(1)
                .setAddress(address.toBuilder().setStreet("Avlabari"))
                .setName("high scool")
                .build();

        System.out.println("Address: \n"+address);
        System.out.println("-".repeat(30));

        System.out.println("Student: \n "+student);
        System.out.println("-".repeat(30));

        System.out.println("School: \n"+school);
        System.out.println("-".repeat(30));

    }
}
