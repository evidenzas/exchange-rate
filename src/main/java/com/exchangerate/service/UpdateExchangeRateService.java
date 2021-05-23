package com.exchangerate.service;

import com.exchangerate.model.ExchangeRate;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

public interface UpdateExchangeRateService {

    List<ExchangeRate> getExchangeRates() throws JsonProcessingException, IllegalAccessException;
    void updateExchangeRates(List<ExchangeRate> updateData);
}
