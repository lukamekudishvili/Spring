package com.lukacode.restful_Web_Services_Demo.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime localDateTime;
    private String errorMessage;
    private String details;

    public ErrorDetails(LocalDateTime localDateTime, String errorMessage, String details) {
        this.localDateTime = localDateTime;
        this.errorMessage = errorMessage;
        this.details = details;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
