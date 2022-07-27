package in.gosoftware.teleassistliveapi.controller;

import in.gosoftware.teleassistliveapi.model.Appointment;
import in.gosoftware.teleassistliveapi.model.CustomerDetails;
import in.gosoftware.teleassistliveapi.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
   private CustomerServiceImpl customerService;

    @PostMapping("/customer")
    public ResponseEntity<CustomerDetails> create(@RequestBody CustomerDetails customerDetails ){

//        CustomerDetails customerDetails=new CustomerDetails();
//        customerDetails.setName("Ardhendu");
//        customerDetails.setCust_mb("0123456789");

        HttpStatus httpStatus=customerDetails!=null?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
        return new ResponseEntity<CustomerDetails>(customerService.create(customerDetails),httpStatus);
    }
    @GetMapping("/customers")

    public ResponseEntity<List<CustomerDetails>> getAll(){

        return new ResponseEntity<>(customerService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")

    public ResponseEntity<Optional<CustomerDetails>> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/customer")

    public ResponseEntity<CustomerDetails> editById(@RequestBody CustomerDetails customerDetails){


        return new ResponseEntity<>(customerService.edit(customerDetails), HttpStatus.OK);


    }

    @DeleteMapping("/customer/{id}")
    public void deleteById(@PathVariable Long id){
        customerService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }

//    @GetMapping("/customer/id")
//    public ResponseEntity<CustomerDetails> getData(@PathVariable("id") String id){
//
//       // customerService.
//
//
//    }
}
