package in.gosoftware.teleassistliveapi.controller;



import in.gosoftware.teleassistliveapi.dto.CustomerListReportDto;
import in.gosoftware.teleassistliveapi.model.CustomerListReport;
import in.gosoftware.teleassistliveapi.service.CustomerListReportServiceImpl;
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
public class CustomerReportController {


    @Autowired
    CustomerListReportServiceImpl customerListReportService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping("/report")
    public ResponseEntity<CustomerListReport> create(@Valid  @RequestBody CustomerListReportDto customerListReportDto ){

//        CustomerDetails customerDetails=new CustomerDetails();
//        customerDetails.setName("Ardhendu");
//        customerDetails.setCust_mb("0123456789");

            CustomerListReport customerListReport=modelMapper.map(customerListReportDto,CustomerListReport.class);

        HttpStatus httpStatus=customerListReport!=null?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
        return new ResponseEntity<CustomerListReport>(customerListReportService.create(customerListReport),httpStatus);
    }
    @GetMapping("/reports")

    public ResponseEntity<List<CustomerListReport>> getAll(){

        return new ResponseEntity<>(customerListReportService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/report/{id}")

    public ResponseEntity<Optional<CustomerListReport>> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerListReportService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/report")

    public ResponseEntity<CustomerListReport> editById(@Valid @RequestBody CustomerListReport customerListReport){


        return new ResponseEntity<>(customerListReportService.edit(customerListReport), HttpStatus.OK);


    }

    @DeleteMapping("/report/{id}")
    public void deleteById(@PathVariable Long id){
        customerListReportService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }

}
