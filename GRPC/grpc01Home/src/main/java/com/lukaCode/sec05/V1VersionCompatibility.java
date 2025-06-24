package com.lukaCode.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.lukaCode.generatedModel.sec05.v1.Television;
import com.lukaCode.sec05.parser.V1Parser;

public class V1VersionCompatibility {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        var tv= Television.newBuilder().setBrand("Samsung").setYear(2025).build();

        V1Parser.parse(tv.toByteArray());
    }
}
