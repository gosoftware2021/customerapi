package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Long> {
}
