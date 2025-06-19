package com.lukaCode.sec03;

import com.lukaCode.generatedModel.sec03.Credentials;
import com.lukaCode.generatedModel.sec03.Email;
import com.lukaCode.generatedModel.sec03.Phone;

public class sec08OneOf {
    public static void main(String[] args) {
        var email= Email.newBuilder().setAddress("Mekudishvililuka@gmail.com").setPassword("admin").build();
        var phone = Phone.newBuilder().setNumber(557481996).setCode(1234).build();

        login(Credentials.newBuilder().setEmail(email).build());
        System.out.println("-".repeat(30));
        login(Credentials.newBuilder().setPhone(phone).build());
    }
    private static void login(Credentials credentials){
        switch (credentials.getCredentialTypeCase()){
            case EMAIL -> System.out.println("Email -> "+credentials.getEmail());
            case PHONE -> System.out.println("Phone -> "+credentials.getPhone());
            default -> System.out.println("Incorrect input!");
        }
    }
}
