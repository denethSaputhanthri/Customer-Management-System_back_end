package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import edu.icet.model.dto.CustomerDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.icet.service.CustomerService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@Tag(name = "Customer-Controller",description = "Customer API Collection...")
public class CustomerController {

    final private CustomerService service;

    @PostMapping("/add/details")
    public void addCustomer(CustomerDto customer){
        service.addCustomer(customer);
    }


}
