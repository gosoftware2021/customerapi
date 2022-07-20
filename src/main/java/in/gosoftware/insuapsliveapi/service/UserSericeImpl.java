package in.gosoftware.insuapsliveapi.service;

import in.gosoftware.insuapsliveapi.model.User;
import in.gosoftware.insuapsliveapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSericeImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public User userSave(User user) {
        return userRepo.save(user);
    }
}
