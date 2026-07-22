package com.cognizant.jpa_comparison;

import com.cognizant.jpa_comparison.model.Country;
import com.cognizant.jpa_comparison.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaComparisonApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        JpaComparisonApplication.class,
                        args);

        CountryService service =
                context.getBean(CountryService.class);

        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");

        service.addCountry(country);

        System.out.println(service.getAllCountries());
    }
}
