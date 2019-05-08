package com.boxknight.merchantservice.payload.create;

import org.springframework.http.HttpStatus;

public class CreateMerchantResponse {
    public boolean success;
    public String message;
    public HttpStatus statusCode;

    public CreateMerchantResponse(boolean success, HttpStatus statusCode, String message) {
        this.statusCode = statusCode;
        this.success = success;
        this.message = message;
    }
}
