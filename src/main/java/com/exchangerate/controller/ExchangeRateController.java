package com.exchangerate.controller;

import com.exchangerate.model.ExchangeRate;
import com.exchangerate.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    @Autowired
    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping(value = "/exchange-rates")
    public ResponseEntity<List<ExchangeRate>> list() {
        final List<ExchangeRate> exchangeRates = exchangeRateService.exchangeRates();

        return exchangeRates != null && !exchangeRates.isEmpty()
                ? new ResponseEntity<>(exchangeRates, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
