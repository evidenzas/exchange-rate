package com.exchangerate.service;

import com.exchangerate.model.ExchangeRate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    private static final Map<Integer, ExchangeRate> EXCHANGE_RATE_REPOSITORY_MAP = new HashMap<>();

    @Override
    public java.util.List<ExchangeRate> exchangeRates() {
        return new ArrayList<>(EXCHANGE_RATE_REPOSITORY_MAP.values());
    }
}
