package com.fstop.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstop.test.entity.country;
import com.fstop.test.service.CountryService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/test")
@Tag(name = "Example API", description = "Example API")
public class CountryController {

	@Autowired
	CountryService countryS;
	
    @GetMapping("/{numbers}")
    public country query(@PathVariable int numbers) {
    	country result=this.countryS.getCountryData(numbers);
    	return result;
    }
}
