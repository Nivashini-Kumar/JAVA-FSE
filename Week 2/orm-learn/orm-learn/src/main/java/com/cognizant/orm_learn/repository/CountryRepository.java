package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.orm_learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContaining(String text);

    List<Country> findByNameContainingOrderByNameAsc(String text);

    @Query(name = "Country.findByNameContaining")
    List<Country> searchCountriesUsingJPQL(@Param("text") String text);

}
