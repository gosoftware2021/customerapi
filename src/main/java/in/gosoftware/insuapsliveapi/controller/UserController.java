package in.gosoftware.insuapsliveapi.controller;

import in.gosoftware.insuapsliveapi.model.User;
import in.gosoftware.insuapsliveapi.service.UserSericeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserSericeImpl userSerice;

    @PostMapping("/")
    public ResponseEntity<User> saveUser(){
        User user=new User();
        user.setName("Soumya");
        user.setEmail("som@gmail.com");
        user.setMobile("1234567890");
        user.setPassword("0123456789");

        HttpStatus httpStatus=user!=null?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
        return new ResponseEntity<User>(userSerice.userSave(user),httpStatus);
    }
}
