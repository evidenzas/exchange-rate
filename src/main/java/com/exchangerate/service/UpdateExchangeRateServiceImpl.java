package com.exchangerate.service;

import com.exchangerate.model.ExchangeRate;
import com.exchangerate.model.Rates;
import com.exchangerate.model.UpdatedRatesPojo;
import com.exchangerate.repository.ExchangeRateRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UpdateExchangeRateServiceImpl implements UpdateExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;
    private final RestTemplate restTemplate;

    public UpdateExchangeRateServiceImpl(ExchangeRateRepository exchangeRateRepository, RestTemplateBuilder restTemplateBuilder) {
        this.exchangeRateRepository = exchangeRateRepository;
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public List<ExchangeRate> getExchangeRates() throws IllegalAccessException {
//        String url = "${url.updateRatesApi}";
        String url = "https://api.exchangerate.host/latest?base={currencyFrom}";
        UpdatedRatesPojo updatedRatesPojo = this.restTemplate.getForObject(url, UpdatedRatesPojo.class, "RUB");
        Rates rates = null;
        if (updatedRatesPojo != null) {
            rates = updatedRatesPojo.getRatesObject();
        }
        int count = 1;
        // TODO move this to ExchangeRate?
        ArrayList<ExchangeRate> updatedData = new ArrayList<>();
        if (rates != null) {
            for (Field field : rates.getFields()) {
                field.setAccessible(true);
                int finalCount = count;
                updatedData.add(new ExchangeRate(
                    finalCount,
                    "RUB",
                    field.getName(),
                    (BigDecimal) field.get(rates),
                    LocalDate.parse(updatedRatesPojo.getDate()),
                    LocalDateTime.now()));
                count++;
            }
        }
        return updatedData;
    }

    @Override
    public void updateExchangeRates(List<ExchangeRate> updateData) {
        exchangeRateRepository.deleteAll();
        exchangeRateRepository.saveAll(updateData);
    }
}
