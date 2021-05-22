package com.exchangerate.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExchangeRate {

    private Integer id;
    private String currencyFromCode;
    private String currencyToCode;
    private LocalDate exchangeRateDate;
    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrencyFromCode() {
        return currencyFromCode;
    }

    public void setCurrencyFromCode(String currencyFromCode) {
        this.currencyFromCode = currencyFromCode;
    }

    public String getCurrencyToCode() {
        return currencyToCode;
    }

    public void setCurrencyToCode(String currencyToCode) {
        this.currencyToCode = currencyToCode;
    }

    public LocalDate getExchangeRateDate() {
        return exchangeRateDate;
    }

    public void setExchangeRateDate(LocalDate exchangeRateDate) {
        this.exchangeRateDate = exchangeRateDate;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

}
