package in.gosoftware.teleassistliveapi.controller;

import in.gosoftware.teleassistliveapi.dto.CustomerCallDto;
import in.gosoftware.teleassistliveapi.model.CustomerCall;
import in.gosoftware.teleassistliveapi.model.CustomerTemplate;
import in.gosoftware.teleassistliveapi.service.CustomerCallServiceImpl;
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

public class CustomerCallController {

    @Autowired
    CustomerCallServiceImpl customerCallService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/call" )
    public ResponseEntity<CustomerCall> create(@Valid @RequestBody CustomerCallDto customerCallDto){


        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");
        CustomerCall customerCall=modelMapper.map(customerCallDto,CustomerCall.class);

        return new ResponseEntity<>(customerCallService.create(customerCall), HttpStatus.CREATED);


    }

    @GetMapping("/allcalls")

    public ResponseEntity<List<CustomerCall>> getAll(){

        return new ResponseEntity<>(customerCallService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/call/{id}")

    public ResponseEntity<CustomerCall> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerCallService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/call")

    public ResponseEntity<CustomerCall> editById(@RequestBody CustomerCall customerCall){


        return new ResponseEntity<>(customerCallService.edit(customerCall), HttpStatus.OK);


    }

    @DeleteMapping("/call/{id}")
    public void deleteById(@PathVariable Long id){
        customerCallService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }


}
