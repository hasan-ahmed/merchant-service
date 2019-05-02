package com.boxknight.merchantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {
    @GetMapping
    public ResponseEntity<?> getAllMerchants() {
        return ResponseEntity.status(HttpStatus.OK).body("The test is working with meta repository!!!!");
    }
}

