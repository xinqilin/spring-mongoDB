package com.bill.mongodb.controller;

import com.bill.mongodb.entity.Customer;
import com.bill.mongodb.service.CustomerService;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping("/id/{id}")
    public Customer getById(@PathVariable("id") String id) {
        if (Strings.isNullOrEmpty(id)) throw new IllegalArgumentException();

        return customerService.getById(id);
    }

    @GetMapping("/name/{name}")
    public Customer getByName(@PathVariable("name") String name) {
        if (Strings.isNullOrEmpty(name)) throw new IllegalArgumentException();

        return customerService.getByName(name);
    }

    @GetMapping("/age/{age}")
    public List<Customer> getCustomerByAge(@PathVariable int age) {
        return customerService.getByAge(age);
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        if (customer == null) throw new IllegalArgumentException();
        return customerService.add(customer);
    }

}
