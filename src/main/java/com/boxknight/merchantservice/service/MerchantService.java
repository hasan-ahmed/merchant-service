package com.boxknight.merchantservice.service;

import com.boxknight.merchantservice.model.Merchant;
import com.boxknight.merchantservice.payload.create.CreateMerchantFailureResponse;
import com.boxknight.merchantservice.payload.create.CreateMerchantRequest;
import com.boxknight.merchantservice.payload.create.CreateMerchantResponse;
import com.boxknight.merchantservice.payload.create.CreateMerchantSuccessResponse;
import com.boxknight.merchantservice.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    public CreateMerchantResponse createMerchant(CreateMerchantRequest createMerchantRequest) {
        Merchant merchant = new Merchant();
        merchant.setName(createMerchantRequest.getName());
        merchant.setIntegrationType(createMerchantRequest.getIntegrationType());
        merchant.setMerchantType(createMerchantRequest.getMerchantType());

        try{
            merchantRepository.save(merchant);
        } catch(Exception e) {
            return(new CreateMerchantFailureResponse(e.getMessage()));
        }

        return new CreateMerchantSuccessResponse(merchant);
    }
}
