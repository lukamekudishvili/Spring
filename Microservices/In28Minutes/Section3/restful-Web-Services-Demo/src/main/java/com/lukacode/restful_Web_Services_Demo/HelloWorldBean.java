package com.lukacode.restful_Web_Services_Demo;

public class HelloWorldBean {
    String message;
    public HelloWorldBean(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
