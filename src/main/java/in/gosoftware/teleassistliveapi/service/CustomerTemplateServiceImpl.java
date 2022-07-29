package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.CustomerTemplate;
import in.gosoftware.teleassistliveapi.repo.CustomerTemplateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTemplateServiceImpl implements CustomerTemplateService{

    @Autowired
    CustomerTemplateRepo customerTemplateRepo;
    @Override
    public CustomerTemplate create(CustomerTemplate customerTemplate) {
        return customerTemplateRepo.save(customerTemplate);
    }

    @Override
    public CustomerTemplate edit(CustomerTemplate customerTemplate) {
        return customerTemplateRepo.save(customerTemplate);
    }

    @Override
    public List<CustomerTemplate> getAll() {
        return customerTemplateRepo.findAll();
    }

    @Override
    public CustomerTemplate getById(Long id) {
        return customerTemplateRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {
        CustomerTemplate customerTemplate=getById(id);
        customerTemplateRepo.deleteById(customerTemplate.getId());

    }
}
