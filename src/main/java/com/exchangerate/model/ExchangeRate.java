package com.exchangerate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "exchange_rates")
public class ExchangeRate {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    @Column(name = "currency_from")
    private String currencyFromCode;

    @Getter
    @Setter
    @Column(name = "currency_to")
    private String currencyToCode;

    @Getter
    @Setter
    @Column(name = "rate")
    private BigDecimal rate;

    @Getter
    @Setter
    @Column(name = "rate_date")
    private LocalDate rateDate;

    @Getter
    @Setter
    @Column(name = "updated_time")
    private LocalDateTime updateTime;

    public ExchangeRate(Integer id, String currencyFromCode, String currencyToCode, BigDecimal rate, LocalDate rateDate, LocalDateTime updateTime) {
        this.id = id;
        this.currencyFromCode = currencyFromCode;
        this.currencyToCode = currencyToCode;
        this.rate = rate;
        this.rateDate = rateDate;
        this.updateTime = updateTime;
    }

    public ExchangeRate() {
    }
}
