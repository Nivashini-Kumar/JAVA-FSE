package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CountryQueryRunner implements CommandLineRunner {

    private final CountryService countryService;

    public CountryQueryRunner(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public void run(String... args) {

        System.out.println("===== Countries containing 'land' =====");

        for (Country country : countryService.searchCountries("land")) {
            System.out.println(country);
        }


        System.out.println("===== Countries containing 'a' sorted =====");

        for (Country country : countryService.searchCountriesSorted("a")) {
            System.out.println(country);
        }


        System.out.println("===== Countries starting with 'A' =====");

        for (Country country : countryService.searchCountriesStartingWith("A")) {
            System.out.println(country);
        }
    }
}
