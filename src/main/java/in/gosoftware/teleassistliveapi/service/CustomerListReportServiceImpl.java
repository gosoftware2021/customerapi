package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.model.CustomerListReport;
import in.gosoftware.teleassistliveapi.repo.CustomerListReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerListReportServiceImpl implements CustomerListReportService{

    @Autowired
    CustomerListReportRepo customerListReportRepo;
    @Override
    public CustomerListReport create(CustomerListReport customerListReport) {
        return customerListReportRepo.save(customerListReport);
    }

    @Override
    public CustomerListReport edit(CustomerListReport customerListReport) {
        return customerListReportRepo.save(customerListReport);
    }

    @Override
    public List<CustomerListReport> getAll() {
        return customerListReportRepo.findAll();
    }

    @Override
    public Optional<CustomerListReport> getById(Long id) {
        return customerListReportRepo.findById(id);
    }

    @Override
    public void delete(Long id) {

        customerListReportRepo.deleteById(id);
    }
}
