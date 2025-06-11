package com.luka.sec02;

import com.luka.model.sec02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo {
    private static final Logger log= LoggerFactory.getLogger(ProtoDemo.class);

    public static void main(String[] args) {
        var person1= createPerson();
        var person2= createPerson();
        System.out.println(System.identityHashCode(person1));
        System.out.println(System.identityHashCode(person2));
        log.info("equals {}",person1.equals(person2));
        log.info("== {}",person1==person2);

        System.out.println("Person1:\n"+person1+"-".repeat(20));
        person1=person1.toBuilder().setName("Alex").build();
        System.out.println("Person1:\n"+person1+"-".repeat(20));

        //if we want to have null values
        var person3= createPerson().toBuilder().clearName().build();
        log.info("person3: {}, name={} ",person3.toString(),person3.getName());
    }

    private static Person createPerson() {
        return Person.newBuilder().
                setName("Luka").
                setAge(23).
                build();
    }
}
