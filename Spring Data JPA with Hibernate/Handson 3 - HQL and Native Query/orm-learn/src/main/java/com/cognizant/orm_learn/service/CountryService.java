package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContaining(text);
    }

    public List<Country> searchCountriesSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    public List<Country> searchCountriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWith(alphabet);
    }
}
