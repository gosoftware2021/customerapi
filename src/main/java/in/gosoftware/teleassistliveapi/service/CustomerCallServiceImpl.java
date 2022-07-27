package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.CustomerCall;
import in.gosoftware.teleassistliveapi.repo.CustomerCallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerCallServiceImpl implements CustomerCallService{

    @Autowired
    CustomerCallRepo customerCallRepo;
    @Override
    public CustomerCall create(CustomerCall customerCall) {
        return customerCallRepo.save(customerCall);
    }

    @Override
    public CustomerCall edit(CustomerCall customerCall) {
        return customerCallRepo.save(customerCall);
    }

    @Override
    public List<CustomerCall> getAll() {
        return customerCallRepo.findAll();
    }

    @Override
    public Optional<CustomerCall> getById(Long id) {
        return customerCallRepo.findById(id);
    }

    @Override
    public void delete(Long id) {
    customerCallRepo.deleteById(id);
    }
}
