package com.service;

import com.entity.Customer;


import java.util.List;

public interface CustomerService {
    Customer create(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    Customer getById(int id);
    List<Customer> getAllActive();
}
