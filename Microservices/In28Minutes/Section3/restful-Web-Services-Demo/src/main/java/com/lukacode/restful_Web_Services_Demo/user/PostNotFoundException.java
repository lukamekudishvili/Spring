package com.lukacode.restful_Web_Services_Demo.user;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}
