package edu.icet.service;

import edu.icet.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    void addCustomer(CustomerDto customer);
    void updateCustomer(CustomerDto customer);
    void deleteCustomer(Integer customerId);
    CustomerDto searchById(Integer customerId);
    List<CustomerDto>getAll();
}
