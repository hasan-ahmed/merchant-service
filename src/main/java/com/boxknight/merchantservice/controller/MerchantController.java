package com.boxknight.merchantservice.controller;

import com.boxknight.merchantservice.payload.create.CreateMerchantRequest;
import com.boxknight.merchantservice.payload.create.CreateMerchantResponse;
import com.boxknight.merchantservice.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @GetMapping
    public ResponseEntity<?> getAllMerchants() {
        return ResponseEntity.status(HttpStatus.OK).body("Testing devpod kfdfdsync");
    }

    @PostMapping
    public ResponseEntity<?> createMerchant(@Valid @RequestBody CreateMerchantRequest createMerchantRequest) {
        CreateMerchantResponse response = merchantService.createMerchant(createMerchantRequest);
        return ResponseEntity.status(response.statusCode).body(response);

    }
}