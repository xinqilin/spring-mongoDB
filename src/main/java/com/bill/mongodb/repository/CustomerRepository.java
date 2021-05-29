package com.bill.mongodb.repository;

import com.bill.mongodb.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Optional<Customer> findByName(String name);

    public List<Customer> findByAge(int age);
}
