package com.bill.mongodb.service;

import com.bill.mongodb.entity.Customer;
import com.bill.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer getById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer getByName(String name) {
        return customerRepository.findById(name).orElse(null);
    }

    public List<Customer> getByAge(int age) {
        return customerRepository.findByAge(age);
    }

    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }
}
