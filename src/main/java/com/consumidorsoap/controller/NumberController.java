package com.consumidorsoap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.consumidorsoap.client.NumberConversionClient;

@RestController
public class NumberController {

    private final NumberConversionClient numberConversionClient;

    public NumberController(NumberConversionClient numberConversionClient) {
        this.numberConversionClient = numberConversionClient;
    }

    @GetMapping("/{number}")
    public String convert(@PathVariable double number) {
        return numberConversionClient.convertToDollar(number);
    }
}

