package service;

import model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    Boolean addCustomer(CustomerDto customer);
    Boolean updateCustomer(CustomerDto customer);
    Boolean deleteCustomer(Integer customerId);
    CustomerDto searchById(Integer customerId);
    List<CustomerDto>getAll();
}
