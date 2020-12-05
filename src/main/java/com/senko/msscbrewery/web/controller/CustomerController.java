package com.senko.msscbrewery.web.controller;

import com.senko.msscbrewery.services.CustomerService;
import com.senko.msscbrewery.web.model.BeerDto;
import com.senko.msscbrewery.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(customerService.getCustomerById(beerId), HttpStatus.OK);
    }
}
