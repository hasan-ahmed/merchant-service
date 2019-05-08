package com.boxknight.merchantservice.payload.create;

import com.boxknight.merchantservice.model.Merchant;
import org.springframework.http.HttpStatus;

public class CreateMerchantSuccessResponse extends CreateMerchantResponse{
    public Merchant merchant;

    public CreateMerchantSuccessResponse(Merchant merchant) {
        super (true, HttpStatus.CREATED, "The merchant has been created successfully");
        this.merchant = merchant;
    }
}
