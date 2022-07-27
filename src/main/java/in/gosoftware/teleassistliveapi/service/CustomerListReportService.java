package in.gosoftware.teleassistliveapi.service;



import in.gosoftware.teleassistliveapi.model.CustomerListReport;

import java.util.List;
import java.util.Optional;

public interface CustomerListReportService {

    CustomerListReport create(CustomerListReport customerListReport);

    CustomerListReport edit(CustomerListReport customerListReport);

    List<CustomerListReport> getAll();

    Optional<CustomerListReport> getById(Long id);

    void delete(Long id);
}
