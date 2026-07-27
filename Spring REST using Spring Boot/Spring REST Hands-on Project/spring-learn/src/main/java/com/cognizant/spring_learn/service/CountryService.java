package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {

        List<Country> countries = new ArrayList<>();

        Country india = new Country();
        india.setCode("IN");
        india.setName("India");

        Country usa = new Country();
        usa.setCode("US");
        usa.setName("United States");

        Country germany = new Country();
        germany.setCode("DE");
        germany.setName("Germany");

        Country japan = new Country();
        japan.setCode("JP");
        japan.setName("Japan");

        countries.add(india);
        countries.add(usa);
        countries.add(germany);
        countries.add(japan);

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}
