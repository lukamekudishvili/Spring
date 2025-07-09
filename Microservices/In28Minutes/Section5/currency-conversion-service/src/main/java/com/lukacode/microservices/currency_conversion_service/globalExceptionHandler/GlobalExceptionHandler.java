package com.lukacode.microservices.currency_conversion_service.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetails> handleAllException(Exception exception, WebRequest webRequest) throws Exception{
        ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(),  webRequest.getDescription(false),LocalDateTime.now());

        return  new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CurrencyNotFoundException.class)
    public final ResponseEntity<ErrorDetails> handleCurrencyNotFoundException(Exception exception, WebRequest webRequest) throws Exception{
        ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(),  webRequest.getDescription(false),LocalDateTime.now());

        return  new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }


}
