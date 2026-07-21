package com.cognizant.orm_learn;

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

    try {

        System.out.println("Before Delete:");
        Country country = countryService.getCountry("IN");
        System.out.println(country);

        countryService.deleteCountry("IN");

        System.out.println("Country deleted successfully");

    } catch (CountryNotFoundException e) {
        System.out.println(e.getMessage());
    }
}
}


