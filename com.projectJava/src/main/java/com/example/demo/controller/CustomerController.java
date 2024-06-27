package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer c) {
        // db save logic
    	
      System.out.println(c.getName());
      
        return "OK";
    }
}
