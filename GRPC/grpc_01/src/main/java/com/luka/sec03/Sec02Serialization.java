package com.luka.sec03;

import com.luka.model.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sec02Serialization {
    private static final Logger log= LoggerFactory.getLogger(Sec02Serialization.class);
    private static final Path PATH= Path.of("person.out");

    public static void main(String[] args) throws IOException {
        Person person=Person.newBuilder().
                setLastName("Luka").
                setAge(25).
                setEmail("mequdishvililuka@gmail.com")
                .setEmployed(true)
                .setSalary(6000.500)
                .setBankAccountNumber(1234567890123L)
                .setBalance(-3000)
                .build();

        serialize(person);
        log.info("{}", deserialize());
        log.info("equals {}",person.equals(deserialize()));
        log.info("bytes length: {}", person.toByteArray().length);
    }

    public static void serialize(Person person)throws IOException {
        try(var stream=Files.newOutputStream(PATH)){
            person.writeTo(stream);
        }

    }

    public static Person deserialize() throws IOException {
        try(var stream=Files.newInputStream(PATH)) {
            return Person.parseFrom(stream);
        }
    }
}
