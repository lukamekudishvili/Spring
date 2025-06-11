package com.luka.sec03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.luka.model.sec03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Path;

public class Lec03PerformanceTest {
    private final static Logger log= LoggerFactory.getLogger(Lec03PerformanceTest.class);
    private static final Path PATH=Path.of("person.out");
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        var protoPerson=Person.newBuilder().
                setLastName("Luka").
                setAge(25).
                setEmail("mequdishvililuka@gmail.com")
                .setEmployed(true)
                .setSalary(6000.500)
                .setBankAccountNumber(1234567890123L)
                .setBalance(-3000)
                .build();
        var jsonPerson=new JsonPerson("Luka",25,
                "mequdishvililuka@gmail.com",
                true, 6000.500,
                1234567890123L,-3000);

        for(int i=0; i<5; i++){
            runTest("json",()-> {
                try {
                    json(jsonPerson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            runTest("proto",()-> {
                try {
                    proto(protoPerson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
    private static void proto(Person person) throws InvalidProtocolBufferException {
        var bytes=person.toByteArray();
        Person.parseFrom(bytes);
    }

    private static void json(JsonPerson person) throws IOException {
        var bytes=mapper.writeValueAsBytes(person);
        mapper.readValue(bytes,JsonPerson.class);
    }

    private static void runTest(String testName, Runnable runnable) {
        var start=System.currentTimeMillis();
        for(int i=0; i<10000000; i++){
            runnable.run();
        }
        var end=System.currentTimeMillis();
        log.info("time taken for {} - {}", testName, (end-start));
    }
}
