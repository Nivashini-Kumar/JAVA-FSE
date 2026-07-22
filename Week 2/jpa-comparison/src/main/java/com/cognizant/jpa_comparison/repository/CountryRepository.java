package com.cognizant.jpa_comparison.repository;

import com.cognizant.jpa_comparison.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
