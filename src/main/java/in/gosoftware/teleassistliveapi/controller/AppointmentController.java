package in.gosoftware.teleassistliveapi.controller;


import in.gosoftware.teleassistliveapi.dto.AppointmentDto;
import in.gosoftware.teleassistliveapi.model.Appointment;
import in.gosoftware.teleassistliveapi.service.AppointmentServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@CrossOrigin(origins = "*")
public class AppointmentController {

    @Autowired
    AppointmentServiceImpl appointmentService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/appointment" )
    public ResponseEntity<Appointment> create(@Valid @RequestBody AppointmentDto appointmentDto){


        //appointmentService.create(appointment);

       // Appointment appointment1=new Appointment();
       // appointment1.setCmpid("123456789");

       Appointment appointment= modelMapper.map(appointmentDto, Appointment.class);
        return new ResponseEntity<>(appointmentService.create(appointment), HttpStatus.CREATED);


    }

    @GetMapping("/appointments")

    public ResponseEntity<List<Appointment>> getAll(){

        return new ResponseEntity<>(appointmentService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/appointment/{id}")

    public ResponseEntity<Appointment> getById(@PathVariable Long id){

        return new ResponseEntity<>(appointmentService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/appointment")

    public ResponseEntity<Appointment> editById(@Valid @RequestBody Appointment appointment){


        return new ResponseEntity<>(appointmentService.edit(appointment), HttpStatus.OK);


    }

    @DeleteMapping("/appointment/{id}")
    public void deleteById(@PathVariable Long id){

        appointmentService.delete(id);
      //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }

}
