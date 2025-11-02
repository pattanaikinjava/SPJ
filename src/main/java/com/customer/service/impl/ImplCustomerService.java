package com.customer.service.impl;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepo;
import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplCustomerService  implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public Customer saveCustomer(Customer customer) {
        Customer custObj =  repo.save(customer);
        return custObj;
    }

    @Override
    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    @Override
    public Optional<Customer> updateCustomerData(Integer Id) {
//        Customer isCustomer = getCustomerById(Id);
//        if(isCustomer != null) {
//            Customer cust = new Customer();
//
//        }
        return null;
    }

    @Override
    public List<Object[]> getCustomerNameAndEmail(Integer Id) {
        return List.of();
    }

    public Customer getCustomerById(Integer Id){
      return null;
    }
}
