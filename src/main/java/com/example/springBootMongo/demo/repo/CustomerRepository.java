package com.example.springBootMongo.demo.repo;

import com.example.springBootMongo.demo.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
