package com.cognizant.orm_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country findCountryByCode(String code) throws CountryNotFoundException {

        Country country = countryRepository.findById(code).orElse(null);

        if (country == null) {
            throw new CountryNotFoundException("Country not found");
        }

        return country;
    }
}
