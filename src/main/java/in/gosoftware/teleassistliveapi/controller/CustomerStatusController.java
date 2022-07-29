package in.gosoftware.teleassistliveapi.controller;


import in.gosoftware.teleassistliveapi.dto.CustomerStatusDto;
import in.gosoftware.teleassistliveapi.model.CustomerStatus;
import in.gosoftware.teleassistliveapi.service.CustomerStatusServiceImpl;
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
public class CustomerStatusController {

    @Autowired
    CustomerStatusServiceImpl customerStatusService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/status" )
    public ResponseEntity<CustomerStatus> create(@Valid  @RequestBody CustomerStatusDto customerStatusDto){


        CustomerStatus customerStatus=modelMapper.map(customerStatusDto,CustomerStatus.class);
        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        return new ResponseEntity<>(customerStatusService.create(customerStatus), HttpStatus.CREATED);


    }

    @GetMapping("/allstatus")

    public ResponseEntity<List<CustomerStatus>> getAll(){

        return new ResponseEntity<>(customerStatusService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/status/{id}")

    public ResponseEntity<CustomerStatus> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerStatusService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/status")

    public ResponseEntity<CustomerStatus> editById(@Valid @RequestBody CustomerStatus customerStatus){


        return new ResponseEntity<>(customerStatusService.edit(customerStatus), HttpStatus.OK);


    }

    @DeleteMapping("/status/{id}")
    public void deleteById(@PathVariable Long id){
        customerStatusService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
