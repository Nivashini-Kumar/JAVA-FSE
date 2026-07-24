package com.bluee.spring_learn.service;

import com.bluee.spring_learn.model.Country;
import com.bluee.spring_learn.model.CountryList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        CountryList countryList =
                context.getBean("countryList", CountryList.class);

        for (Country country : countryList.getCountryList()) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}