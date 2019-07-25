package com.controller;

import com.entity.Customer;
import com.entity.Farmer;
import com.service.CustomerService;
import com.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CustomerController {
        private CustomerService customerService;

        @Autowired
        public CustomerController(CustomerService customerService){
            this.customerService=customerService;
        }
        @GetMapping("/customers/active")
        public List<Customer> getAllCustomers(){
            return customerService.getAllActive();
        }

        @PostMapping("/customer")
        public void create(@RequestBody Customer customer){
            customerService.create(customer);
        }

        @PutMapping("/customer")
        public void update(@RequestBody Customer customer){
            customerService.update(customer);
        }
        @DeleteMapping("/customer")
        public void delete(@RequestBody Customer customer){
            customerService.delete(customer);
        }

    }
