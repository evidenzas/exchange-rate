package com.exchangerate.repository;

import com.exchangerate.model.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

public interface UpdatedRateRepository extends CrudRepository<ExchangeRate, Integer> {
}
