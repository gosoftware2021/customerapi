package in.gosoftware.teleassistliveapi.service;

import in.gosoftware.teleassistliveapi.exception.NoDataFoundException;
import in.gosoftware.teleassistliveapi.model.User;
import in.gosoftware.teleassistliveapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSericeImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public User userSave(User user) {
        return userRepo.save(user);
    }

    @Override
    public User edit(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(()->new NoDataFoundException("No User Found with this id:"+id));
    }

    @Override
    public void delete(Long id) {

        User user=getById(id);


        userRepo.deleteById(user.getId());

    }
}
