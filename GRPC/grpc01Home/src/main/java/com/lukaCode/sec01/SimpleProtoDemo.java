//package com.lukaCode.sec01;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import com.lukaCode.gemodel.sec01.PersonOuterClass;
//
//public class SimpleProtoDemo {
//    private static final Logger log= LoggerFactory.getLogger(SimpleProtoDemo.class);
//
//    public static void main(String[] args) {
//        var person= PersonOuterClass.Person.newBuilder()
//                .setName("Luka")
//                .setAge(21).build();
//
//        log.info("{} ",person);
//
//    }
//
//}
