package com.yurchello.microservicesexample.forex.repository;

import com.yurchello.microservicesexample.forex.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
    ExchangeValue findByFromAndTo(String from, String to);
}
