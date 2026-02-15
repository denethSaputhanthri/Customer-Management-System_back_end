package service.Impl;

import lombok.RequiredArgsConstructor;
import model.dto.CustomerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import service.CustomerService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final private CustomerRepository repository;
    final private ModelMapper mapper;

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
