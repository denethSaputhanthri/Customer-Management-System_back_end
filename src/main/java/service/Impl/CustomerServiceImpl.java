package service.Impl;

import model.dto.CustomerDto;
import org.springframework.stereotype.Service;
import service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Boolean addCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public Boolean updateCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Integer customerId) {
        return null;
    }

    @Override
    public CustomerDto searchById(Integer customerId) {
        return null;
    }

    @Override
    public List<CustomerDto> getAll() {
        return List.of();
    }
}
