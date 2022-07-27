package in.gosoftware.teleassistliveapi.service;

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
    public Optional<CustomerTemplate> getById(Long id) {
        return customerTemplateRepo.findById(id);
    }

    @Override
    public void delete(Long id) {

        customerTemplateRepo.deleteById(id);

    }
}
