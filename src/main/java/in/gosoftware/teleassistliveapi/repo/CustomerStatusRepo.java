package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerStatusRepo extends JpaRepository<CustomerStatus,Long> {
}
