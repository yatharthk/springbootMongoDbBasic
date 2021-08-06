package com.example.springBootMongo.demo.service;

import com.example.springBootMongo.demo.DTO.CustomerDTO;
import com.example.springBootMongo.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository repository;
    @Override
    public void insertCustomer(CustomerDTO Customer) {
        repository.save(CustomerDTO.prepareCustomerEntity(Customer));

    }
    @Override
    public void removeCustomer(long phoneNo) {
        repository.deleteById(phoneNo);
    }

}
