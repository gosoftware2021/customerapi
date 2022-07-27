package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.CustomerList;
import in.gosoftware.teleassistliveapi.repo.CustomerListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerListServideimpl implements CustomerListService{

    @Autowired
    CustomerListRepo customerListRepo;
    @Override
    public CustomerList create(CustomerList customerList) {
        return customerListRepo.save(customerList);
    }

    @Override
    public CustomerList edit(CustomerList customerList) {
        return customerListRepo.save(customerList);
    }

    @Override
    public List<CustomerList> getAll() {
        return customerListRepo.findAll();
    }

    @Override
    public Optional<CustomerList> getById(Long id) {
        return customerListRepo.findById(id);
    }

    @Override
    public void delete(Long id) {
        customerListRepo.deleteById(id);
    }
}
