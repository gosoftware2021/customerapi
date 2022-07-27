package in.gosoftware.teleassistliveapi.controller;

import in.gosoftware.teleassistliveapi.dto.UserDto;

import in.gosoftware.teleassistliveapi.model.User;
import in.gosoftware.teleassistliveapi.service.UserSericeImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserSericeImpl userSerice;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserDto userdto ){
//        User user=new User();
//        user.setName("Soumya");
//        user.setEmail("som@gmail.com");
//        user.setMobile("1234567890");
//        user.setPassword("0123456789");
        User user=modelMapper.map(userdto, User.class);

        //HttpStatus httpStatus=user!=null?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
        return new ResponseEntity<User>(userSerice.userSave(user),HttpStatus.CREATED);
    }

    @GetMapping("/users")

    public ResponseEntity<List<User>> getAll(){

        return new ResponseEntity<>(userSerice.getAll(),HttpStatus.OK);
    }

    @GetMapping("/user/{id}")

    public ResponseEntity<Optional<User>> getById(@PathVariable(name = "id") Long id){

        return new ResponseEntity<>(userSerice.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/user")

    public ResponseEntity<User> editById(@RequestBody @Valid UserDto userdto){

        User user=modelMapper.map(userdto, User.class);
        return new ResponseEntity<>(userSerice.edit(user), HttpStatus.OK);


    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable Long id){
        userSerice.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
