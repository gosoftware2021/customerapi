package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.CustomerStatus;
import in.gosoftware.teleassistliveapi.repo.CustomerStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerStatusServiceImpl implements CustomerStatusService{


    @Autowired
    CustomerStatusRepo customerStatusRepo;
    @Override
    public CustomerStatus create(CustomerStatus customerStatus) {
        return customerStatusRepo.save(customerStatus);
    }

    @Override
    public CustomerStatus edit(CustomerStatus customerStatus) {
        return customerStatusRepo.save(customerStatus);
    }

    @Override
    public List<CustomerStatus> getAll() {
        return customerStatusRepo.findAll();
    }

    @Override
    public Optional<CustomerStatus> getById(Long id) {
        return customerStatusRepo.findById(id);
    }

    @Override
    public void delete(Long id) {

        customerStatusRepo.deleteById(id);

    }
}
