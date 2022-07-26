package in.gosoftware.teleassistliveapi.controller;

import in.gosoftware.teleassistliveapi.dto.CustomerTemplateDto;
import in.gosoftware.teleassistliveapi.model.CustomerStatus;
import in.gosoftware.teleassistliveapi.model.CustomerTemplate;
import in.gosoftware.teleassistliveapi.service.CustomerTemplateServiceImpl;
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
public class CustomerTemplateController {

    @Autowired
    CustomerTemplateServiceImpl customerTemplateService;


    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/template" )
    public ResponseEntity<CustomerTemplate> create(@Valid  @RequestBody CustomerTemplateDto customerTemplateDto){


        CustomerTemplate customerTemplate=modelMapper.map(customerTemplateDto,CustomerTemplate.class);
        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        return new ResponseEntity<>(customerTemplateService.create(customerTemplate), HttpStatus.CREATED);


    }

    @GetMapping("/templates")

    public ResponseEntity<List<CustomerTemplate>> getAll(){

        return new ResponseEntity<>(customerTemplateService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/template/{id}")

    public ResponseEntity<CustomerTemplate> getById(@PathVariable Long id){

        return new ResponseEntity<>(customerTemplateService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/template")

    public ResponseEntity<CustomerTemplate> editById(@Valid @RequestBody CustomerTemplate customerTemplate){


        return new ResponseEntity<>(customerTemplateService.edit(customerTemplate), HttpStatus.OK);


    }

    @DeleteMapping("/template/{id}")
    public void deleteById(@PathVariable Long id){
        customerTemplateService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
