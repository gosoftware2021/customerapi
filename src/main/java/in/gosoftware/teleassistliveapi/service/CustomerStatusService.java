package in.gosoftware.teleassistliveapi.service;



import in.gosoftware.teleassistliveapi.model.CustomerStatus;

import java.util.List;
import java.util.Optional;

public interface CustomerStatusService {
    CustomerStatus create(CustomerStatus customerStatus);

    CustomerStatus edit(CustomerStatus customerStatus);

    List<CustomerStatus> getAll();

    CustomerStatus getById(Long id);

    void delete(Long id);
}
