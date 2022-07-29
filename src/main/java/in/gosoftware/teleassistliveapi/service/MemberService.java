package in.gosoftware.teleassistliveapi.service;


import in.gosoftware.teleassistliveapi.model.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member create(Member member);

    Member edit(Member member);

    List<Member> getAll();

    Member getById(Long id);

    void delete(Long id);
}
