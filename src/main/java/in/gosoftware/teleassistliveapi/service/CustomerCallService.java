package in.gosoftware.teleassistliveapi.service;



import in.gosoftware.teleassistliveapi.model.CustomerCall;

import java.util.List;
import java.util.Optional;

public interface CustomerCallService {

    CustomerCall create(CustomerCall customerCall);

    CustomerCall edit(CustomerCall customerCall);

    List<CustomerCall> getAll();

    CustomerCall getById(Long id);

    void delete(Long id);
}
