package com.bluee.spring_learn.controller;

import com.bluee.spring_learn.model.Country;
import com.bluee.spring_learn.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {
        return country;
    }
}