package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code) throws CountryNotFoundException {

        return countryRepository.findById(code)
                .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }

    public List<Country> searchCountries(String text) {
        return countryRepository.searchCountriesUsingJPQL(text);
    }

    @Transactional
    public void updateCountry(String code, String newName)
            throws CountryNotFoundException {

        Country country = getCountry(code);
        country.setName(newName);
    }
}

@Transactional
public void deleteCountry(String code) throws CountryNotFoundException {

    Country country = getCountry(code);

    countryRepository.delete(country);
}


