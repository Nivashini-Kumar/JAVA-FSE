package com.cognizant.jpa_comparison.service;

import com.cognizant.jpa_comparison.model.Country;
import com.cognizant.jpa_comparison.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
