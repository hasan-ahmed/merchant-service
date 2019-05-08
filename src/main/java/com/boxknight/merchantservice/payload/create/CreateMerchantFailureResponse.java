package com.boxknight.merchantservice.payload.create;

import org.springframework.http.HttpStatus;

public class CreateMerchantFailureResponse extends CreateMerchantResponse {

    public CreateMerchantFailureResponse(String message) {
        super(false, HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}
