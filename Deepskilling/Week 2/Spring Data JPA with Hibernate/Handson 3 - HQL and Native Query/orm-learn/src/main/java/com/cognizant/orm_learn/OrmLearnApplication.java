package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("========== FIND COUNTRIES CONTAINING 'un' ==========");

        List<Country> countries = countryService.searchCountries("un");

        countries.forEach(System.out::println);


        System.out.println("\n========== FIND COUNTRIES CONTAINING 'un' SORTED ==========");

        List<Country> sortedCountries =
                countryService.searchCountriesSorted("un");

        sortedCountries.forEach(System.out::println);


        System.out.println("\n========== FIND COUNTRIES STARTING WITH 'A' ==========");

        List<Country> startCountries =
                countryService.searchCountriesStartingWith("A");

        startCountries.forEach(System.out::println);
    }
}
