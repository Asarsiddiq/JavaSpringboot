package com.example.onlineuzhavar.service;

import com.example.onlineuzhavar.DTO.CustomerSaveDTO;
import com.example.onlineuzhavar.customerRepo.CustomerRepo;
import com.example.onlineuzhavar.entity.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        customer Customer=new customer(
                customerSaveDTO.getCname(),
                customerSaveDTO.getContact()

        );
        customerRepo.save(Customer);
        return Customer.getCname();
    }
}
