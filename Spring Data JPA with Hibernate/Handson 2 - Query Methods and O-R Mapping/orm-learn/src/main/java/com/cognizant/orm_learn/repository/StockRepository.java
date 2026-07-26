package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.orm_learn.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByNameContaining(String name);

    List<Stock> findByPriceGreaterThan(double price);

}
