package com.customer.controller;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.net.URI;


@RequestMapping(value="/api/customers/v3")
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customerPayLoad){
      Customer customerObj =   service.saveCustomer(customerPayLoad);
       URI location =  URI.create("/customers/v3/create/" + customerObj.getCustId());
       return ResponseEntity.created(location).body(customerObj);
    }

    @GetMapping("/fetch/all")
    public ResponseEntity<List<Customer>> getCustomerList(){
        return ResponseEntity.ok(service.getCustomers());
    }
}
