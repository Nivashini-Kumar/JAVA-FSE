package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        System.out.println("========== ALL COUNTRIES ==========");
        countryService.getAllCountries().forEach(System.out::println);

        System.out.println("\n========== FIND COUNTRY ==========");
        Country country = countryService.getCountry("US");

        if (country != null) {
            System.out.println(country);
        } else {
            System.out.println("Country not found.");
        }

        System.out.println("\n========== ADD COUNTRY ==========");
        Country newCountry = new Country("FR", "France");
        countryService.addCountry(newCountry);

        System.out.println("Country Added Successfully!");

        System.out.println("\n========== ALL COUNTRIES AFTER INSERT ==========");
        countryService.getAllCountries().forEach(System.out::println);
    }
}
