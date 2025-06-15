//package com.lukaCode.sec03;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.protobuf.InvalidProtocolBufferException;
//import com.lukaCode.model.sec03.Person;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class Lec03PerformanceTest {
//    private static final ObjectMapper mapper=new ObjectMapper();
//    private static final Logger log= LoggerFactory.getLogger(Lec03PerformanceTest.class);
//    public static void main(String[] args) {
//        var protoPerson= Person.newBuilder()
//                .setLastName("Mekudishvili")
//                .setAge(22)
//                .setEmail("mekudishvili@gmail.com")
//                .setEmployed(true)
//                .setSalary(10000.680)
//                .setBankAccountNumber(123456789012L)
//                .setBankAccountNumber(-400)
//                .build();
//        var jsonPerson=new JsonPerson("Mekudishvili",22,
//                "mekudishvili@gmail.com", true,10000.680,
//                123456789012L, -400);
//
//        for (int i = 0; i < 10; i++) {
////            runTest("json",()->json(jsonPerson));
//            runTest("proto",()->proto(protoPerson));
//        }
//    }
//    private static void proto(Person person){
//
//        try {
//            var bytes=person.toByteArray();
//            Person.parseFrom(bytes);
//        } catch (InvalidProtocolBufferException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static void json(JsonPerson jsonPerson){
//        try{
//            var bytes=mapper.writeValueAsBytes(jsonPerson);
//            mapper.readValue(bytes,JsonPerson.class);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static void runTest(String testName, Runnable runnable){
//        var start=System.currentTimeMillis();
//        for(int i=0; i<10000000; i++){
//            runnable.run();
//        }
//        var end=System.currentTimeMillis();
//
//        log.info("Time taken for {} - {} ms",testName,(end-start));
//    }
//}
