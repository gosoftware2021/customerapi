package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.CustomerDetails;
import in.gosoftware.teleassistliveapi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl  implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;
    @Override
    public CustomerDetails create(CustomerDetails customerDetails) {
        return customerRepo.save(customerDetails);
    }

    @Override
    public CustomerDetails edit(CustomerDetails customerDetails) {
        return customerRepo.save(customerDetails);
    }

    @Override
    public List<CustomerDetails> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public CustomerDetails getById(Long id) {
        return customerRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));

    }

    @Override
    public void delete(Long id) {

        CustomerDetails customerDetails=getById(id);

        customerRepo.deleteById(customerDetails.getId());

    }
}
