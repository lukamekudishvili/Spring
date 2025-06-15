//package com.lukaCode.sec02;
//
//import com.lukaCode.sec01.SimpleProtoDemo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import com.lukaCode.model.sec02.Person;
//
//public class ProtoDemo {
//    private static final Logger log= LoggerFactory.getLogger(SimpleProtoDemo.class);
//
//    public static void main(String[] args) {
////        var person= Person.newBuilder().setName("TEPO").setAge(24).build();
////
////        log.info("{}",person);
//
//        var person=createPerson("Luka",23);
//
//        var person2=createPerson("Luka",23);
//
//        System.out.println("person == person2: "+(person==person2));
//        System.out.println("person.equals(person2): "+(person.equals(person2)));
//        System.out.println(System.identityHashCode(person));
//        System.out.println(System.identityHashCode(person2));
//    }
//
//    private static Person createPerson(String name, int age){
//        return Person.newBuilder().setName(name).setAge(age).build();
//    }
//}
