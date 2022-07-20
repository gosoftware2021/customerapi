package in.gosoftware.insuapsliveapi.repo;

import in.gosoftware.insuapsliveapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
