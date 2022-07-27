package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.CustomerList;
import in.gosoftware.teleassistliveapi.model.Member;

import java.util.List;
import java.util.Optional;

public interface CustomerListService {

    CustomerList create(CustomerList customerList);

    CustomerList edit(CustomerList customerList);

    List<CustomerList> getAll();

    Optional<CustomerList> getById(Long id);

    void delete(Long id);
}
