package com.luka.sec01;

import com.luka.model.sec01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {
        var person = PersonOuterClass.Person.newBuilder()
                .setName("Luka")
                .setAge(40)
                .build();

        LOG.info("{}",person);
    }

}
