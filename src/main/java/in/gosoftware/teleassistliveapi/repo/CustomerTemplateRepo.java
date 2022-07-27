package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.CustomerTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTemplateRepo extends JpaRepository<CustomerTemplate,Long> {
}
