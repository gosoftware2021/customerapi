package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.CustomerCall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerCallRepo extends JpaRepository<CustomerCall,Long> {
}
