package com.bill.mongodb.repository;

import com.bill.mongodb.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Optional<Customer> findByName(String name);

    public List<Customer> findByAge(int age);
}
