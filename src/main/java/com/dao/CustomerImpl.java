package com.dao;

import com.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerImpl implements CustomerDAO {

    private EntityManager entityManager;
    @Autowired
    public CustomerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllByStatus(int status) {
        return null;
    }
}
