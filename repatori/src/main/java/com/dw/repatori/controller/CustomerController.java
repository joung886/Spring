package com.dw.repatori.controller;

import com.dw.repatori.model.Customer;
import com.dw.repatori.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

//    @GetMapping("/find-all-customers")
//    public List<Customer> getAllController() {
//        return customerService.getAllCustomers();
    }
//}
