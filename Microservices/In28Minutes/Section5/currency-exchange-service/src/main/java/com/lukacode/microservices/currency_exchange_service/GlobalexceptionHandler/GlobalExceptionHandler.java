package com.lukacode.microservices.currency_exchange_service.GlobalexceptionHandler;

import com.lukacode.microservices.currency_exchange_service.model.CurrencyNotFoundException;
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
    public final ResponseEntity<ErrorDetails> handleAllException(Exception ex, WebRequest request) throws Exception{
        ErrorDetails errorDetails=new ErrorDetails(ex.getMessage(), LocalDateTime.now(), request.getDescription(false));

        return  new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CurrencyNotFoundException.class)
    public final ResponseEntity<ErrorDetails> handleCurrencyNotFoundException(Exception ex, WebRequest request) throws Exception{
        ErrorDetails errorDetails=new ErrorDetails(ex.getMessage(), LocalDateTime.now(), request.getDescription(false));

        return  new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}
