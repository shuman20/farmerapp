package com.service;

import com.dao.CustomerDAO;
import com.dao.FarmerDAO;
import com.entity.Customer;
import com.entity.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    private final int Active=1;

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO=customerDAO;
    }

    @Override
    public Customer create(Customer customer) {
        return customerDAO.create(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDAO.update(customer);

    }

    @Override
    public void delete(Customer customer) {
        customerDAO.delete(customer);
    }

    @Override
    public Customer getById(int id) {
        return customerDAO.getById(id);
    }

    @Override
    public List<Customer> getAllActive() {
        return customerDAO.getAllByStatus(Active);
    }
}
