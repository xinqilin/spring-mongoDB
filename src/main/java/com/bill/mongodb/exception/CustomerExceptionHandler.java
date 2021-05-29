package com.bill.mongodb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    public final ResponseEntity handleDemoException(CustomerException e) {
        System.out.println("handle CustomerException...");
        System.out.println("error code:" + e.getErrorCode());
        System.out.println("error message:" + e.getErrorMessage());
        return new ResponseEntity("parameter is bad!!!",
                HttpStatus.BAD_REQUEST);
    }
}
