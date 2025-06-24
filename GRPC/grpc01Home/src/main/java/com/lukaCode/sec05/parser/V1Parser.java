package com.lukaCode.sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import com.lukaCode.generatedModel.sec05.v1.Television;

public class V1Parser {
    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
        var tv= Television.parseFrom(bytes);
        System.out.println(tv.toString());
    }
}
