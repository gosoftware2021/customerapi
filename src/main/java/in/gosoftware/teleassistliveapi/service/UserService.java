package in.gosoftware.teleassistliveapi.service;


import in.gosoftware.teleassistliveapi.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User userSave(User user);

    User edit(User user);
    List<User> getAll();

    User getById(Long id);

    void delete(Long id);
}
