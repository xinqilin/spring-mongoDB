package com.bill.mongodb.service;

import com.bill.mongodb.entity.Customer;
import com.bill.mongodb.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public List<Customer> getByAgeWithPage(int age) {
        var page = 0;  // 查詢頁數，從0開始為第一頁
        var size = 3; // 每頁筆數，設為每頁3筆
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by("age").descending());
        Page<Customer> pageResult = customerRepository.findByAge(age, pageRequest);

        // 全部頁數
        System.out.println("getTotalPages(): " + pageResult.getTotalPages());
        // 全部筆數
        System.out.println("getTotalElements(): " + pageResult.getTotalElements());
        // 每頁筆數
        System.out.println("getSize(): " + pageResult.getSize());
        // 目前頁號，0為第一頁
        System.out.println("getNumber(): " + pageResult.getNumber());
        // 目前頁筆數
        System.out.println("getNumberOfElements(): " + pageResult.getNumberOfElements());
        //result
        System.out.println("getContent(): " + pageResult.getContent());
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonString = mapper.writeValueAsString(pageResult.getContent()); // 轉成json字串
//        System.out.println(jsonString);
        return pageResult.getContent();
    }

    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }
}
