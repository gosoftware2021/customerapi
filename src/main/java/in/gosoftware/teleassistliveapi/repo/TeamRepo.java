package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,Long> {
}
