package com.lukacode.kafkaTutorial.ProductsMicroservice.Model;

import java.time.LocalDateTime;

public class CustomErrorMessage {
    private String message;
    private LocalDateTime errorDateTime;
    private String details;

    public CustomErrorMessage() {
    }

    public CustomErrorMessage(String message, LocalDateTime errorDateTime, String details) {
        this.message = message;
        this.errorDateTime = errorDateTime;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getErrorDateTime() {
        return errorDateTime;
    }

    public void setErrorDateTime(LocalDateTime errorDateTime) {
        this.errorDateTime = errorDateTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
