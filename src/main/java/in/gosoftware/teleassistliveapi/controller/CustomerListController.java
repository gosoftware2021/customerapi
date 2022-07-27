package in.gosoftware.teleassistliveapi.controller;

import in.gosoftware.teleassistliveapi.model.CustomerDetails;
import in.gosoftware.teleassistliveapi.model.CustomerList;
import in.gosoftware.teleassistliveapi.service.CustomerListServideimpl;
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
public class CustomerListController {

    @Autowired
    CustomerListServideimpl customerListServideimpl;

    @PostMapping("/customerlist")
    public ResponseEntity<CustomerList> create(@Valid  @RequestBody CustomerList customerList ){

//        CustomerDetails customerDetails=new CustomerDetails();
//        customerDetails.setName("Ardhendu");
//        customerDetails.setCust_mb("0123456789");

        HttpStatus httpStatus=customerList!=null?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
        return new ResponseEntity<CustomerList>(customerListServideimpl.create(customerList),httpStatus);
    }
    @GetMapping("/customerlists")

    public ResponseEntity<List<CustomerList>> getAll(){

        return new ResponseEntity<>(customerListServideimpl.getAll(),HttpStatus.OK);
    }

    @GetMapping("/customerlist/{id}")

    public ResponseEntity<Optional<CustomerList>> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerListServideimpl.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/customerlist")

    public ResponseEntity<CustomerList> editById(@Valid @RequestBody CustomerList customerList){


        return new ResponseEntity<>(customerListServideimpl.edit(customerList), HttpStatus.OK);


    }

    @DeleteMapping("/customerlist/{id}")
    public void deleteById(@PathVariable Long id){
        customerListServideimpl.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
