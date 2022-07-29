package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepo extends JpaRepository<Member,Long> {

    Optional<Member> findByEmail(String email);
}
