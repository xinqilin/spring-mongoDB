package com.bill.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@Document(collection = "customers")
public class Customer {

    @Id
    public String id;

    @Field("name")
    public String name;

    @Field("age")
    public int age;
}
