package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Uncomment ONLY ONE test at a time.

        testGetCountry();
        // testUpdateCountry();
        // testDeleteCountry();
        // testSearchCountries();
    }

    private void testGetCountry() {

        System.out.println("----- Get Country -----");

        try {
            Country country = countryService.getCountry("IN");
            System.out.println(country);
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void testUpdateCountry() {

        System.out.println("----- Update Country -----");

        try {
            countryService.updateCountry("IN", "India Updated");
            System.out.println(countryService.getCountry("IN"));
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void testDeleteCountry() {

        System.out.println("----- Delete Country -----");

        try {
            countryService.deleteCountry("IN");
            System.out.println("Country deleted successfully");
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void testSearchCountries() {

        System.out.println("----- Search Countries -----");

        List<Country> countries = countryService.searchCountries("ou");

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
