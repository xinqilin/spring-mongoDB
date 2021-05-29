package com.bill.mongodb.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

}
