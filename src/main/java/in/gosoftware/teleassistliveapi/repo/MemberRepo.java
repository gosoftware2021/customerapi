package in.gosoftware.teleassistliveapi.repo;

import in.gosoftware.teleassistliveapi.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Long> {
}
