package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
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
    public CustomerList getById(Long id) {
        return customerListRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {

        CustomerList customerList=getById(id);
        customerListRepo.deleteById(customerList.getId());
    }
}
