package in.gosoftware.teleassistliveapi.service;



import in.gosoftware.teleassistliveapi.model.CustomerDetails;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerDetails create(CustomerDetails customerDetails);

    CustomerDetails edit(CustomerDetails customerDetails);

    List<CustomerDetails> getAll();

    Optional<CustomerDetails> getById(Long id);

    void delete(Long id);
}
