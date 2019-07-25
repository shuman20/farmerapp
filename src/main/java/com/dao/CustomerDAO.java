package com.dao;

import com.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    Customer create(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    Customer getById(int id);
    List<Customer> getAllByStatus(int status);
}
