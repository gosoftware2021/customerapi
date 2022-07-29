package in.gosoftware.teleassistliveapi.service;


import in.gosoftware.teleassistliveapi.model.Member;
import in.gosoftware.teleassistliveapi.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupUserDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepo memberRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Member> member = memberRepo.findByEmail(email);
        return member.map(GroupUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(email + " Not Found"));
    }
}
