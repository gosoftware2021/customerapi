package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.Member;
import in.gosoftware.teleassistliveapi.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepo memberRepo;
    @Override
    public Member create(Member member) {
        return memberRepo.save(member);
    }

    @Override
    public Member edit(Member member) {
        return memberRepo.save(member);
    }

    @Override
    public List<Member> getAll() {
        return memberRepo.findAll();
    }

    @Override
    public Member getById(Long id) {
        return memberRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {

        Member member=getById(id);

        memberRepo.deleteById(member.getId());

    }
}
