package com.exchangerate.schedule;

import com.exchangerate.service.UpdateExchangeRateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UpdateRatesSchedulerImpl implements UpdateRatesScheduler {

    private final UpdateExchangeRateService updateExchangeRateService;

    public UpdateRatesSchedulerImpl(UpdateExchangeRateService updateExchangeRateService) {
        this.updateExchangeRateService = updateExchangeRateService;
    }

    @Override
    @Scheduled(fixedRateString = "${cron.updateRatesPeriod}")
    public void run() {
        log.info("Update exchange rates scheduler start work.");
        try {
            updateExchangeRateService.updateExchangeRates(updateExchangeRateService.getExchangeRates());
            log.info("Exchange rates successfully updated.");
        } catch (Exception e) {
            log.error("Exception during reloading exchange rates: ${e}", e);
        }
    }
}
