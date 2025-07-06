package com.lukacode.microservices.currency_exchange_service.repository;

import com.lukacode.microservices.currency_exchange_service.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    @Query("SELECT c FROM CurrencyExchange c WHERE c.from = :from AND c.to = :to")
    CurrencyExchange findByFromAndTo(@Param("from") String from, @Param("to") String to);
}
