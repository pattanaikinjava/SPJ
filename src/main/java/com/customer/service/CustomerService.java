package com.customer.service;

import com.customer.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CustomerService {
   Customer saveCustomer(Customer customer);
   List<Customer> getCustomers();
   Optional<Customer> updateCustomerData(Integer Id);
   List<Object[]> getCustomerNameAndEmail(Integer Id);
}
