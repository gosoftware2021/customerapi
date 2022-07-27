package in.gosoftware.teleassistliveapi.service;



import in.gosoftware.teleassistliveapi.model.CustomerTemplate;

import java.util.List;
import java.util.Optional;

public interface CustomerTemplateService {

    CustomerTemplate create(CustomerTemplate customerTemplate);

    CustomerTemplate edit(CustomerTemplate customerTemplate);

    List<CustomerTemplate> getAll();

    Optional<CustomerTemplate> getById(Long id);

    void delete(Long id);
}
