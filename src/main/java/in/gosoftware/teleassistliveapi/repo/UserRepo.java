package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<User,Long> {
}
