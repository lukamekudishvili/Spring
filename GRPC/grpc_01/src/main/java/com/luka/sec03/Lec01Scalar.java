package com.luka.sec03;

import com.luka.model.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01Scalar {
    private static final Logger log= LoggerFactory.getLogger(Lec01Scalar.class);
    public static void main(String[] args) {
        Person person=Person.newBuilder().
                setLastName("Luka").
                setAge(25).
                setEmail("mequdishvililuka@gmail.com")
//                .setEmployed(true)
//                .setSalary(6000.500)
                .setBankAccountNumber(1234567890123L)
                .setBalance(-3000)
                .build();

        log.error("{}",person);
    }
}
