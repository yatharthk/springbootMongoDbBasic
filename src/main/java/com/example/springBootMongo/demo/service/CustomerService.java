package com.example.springBootMongo.demo.service;

import com.example.springBootMongo.demo.DTO.CustomerDTO;

public interface CustomerService {
    // Method to access data access layer method to insert Customer record
     void insertCustomer(CustomerDTO Customer) ;
    // Method to access data access layer method to remove a record
     void removeCustomer(long phoneNo);
}
