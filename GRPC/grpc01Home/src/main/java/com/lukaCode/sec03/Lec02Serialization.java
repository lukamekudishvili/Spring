//package com.lukaCode.sec03;
//
//import com.lukaCode.model.sec03.Person;
//import com.lukaCode.sec01.SimpleProtoDemo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class Lec02Serialization {
//    private static final Logger log= LoggerFactory.getLogger(SimpleProtoDemo.class);
//    private static final Path PATH=Path.of("person.out");
//
//    public static void main(String[] args) throws IOException {
//        var person= Person.newBuilder()
//                .setLastName("Mekudishvili")
//                .setAge(22)
//                .setEmail("mekudishvili@gmail.com")
//                .setEmployed(true)
//                .setSalary(10000.680)
//                .setBankAccountNumber(123456789012L)
//                .setBankAccountNumber(-400)
//                .build();
//
//        serialize(person);
//        log.info("{}", deserialize());
//
//    }
//    public static void serialize(Person person) throws IOException {
//
//        try(var stream=Files.newOutputStream(PATH)){
//            person.writeTo(stream);
//        }
//
//    }
//
//    public static Person deserialize() throws IOException {
//        try(var stream= Files.newInputStream(PATH)){
//            return Person.parseFrom(stream);
//        }
//    }
//}
