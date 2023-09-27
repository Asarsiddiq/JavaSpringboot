package com.example.onlineuzhavar.customerController;


import com.example.onlineuzhavar.DTO.CustomerDTO;
import com.example.onlineuzhavar.DTO.CustomerSaveDTO;
import com.example.onlineuzhavar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class customerController {

    @Autowired
    private CustomerService customerService;




    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){


        String id= customerService.addCustomer(customerSaveDTO);
        return id;


    }
}
