package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.CustomerList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerListRepo extends JpaRepository<CustomerList ,Long> {
}
