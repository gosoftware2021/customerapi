package in.gosoftware.teleassistliveapi.controller;
import in.gosoftware.teleassistliveapi.dto.ReminderDto;
import in.gosoftware.teleassistliveapi.model.Reminder;
import in.gosoftware.teleassistliveapi.service.ReminderServiceImpl;
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
public class ReminderController {

    @Autowired
    ReminderServiceImpl reminderService;


    @Autowired
    ModelMapper modelMapper;
    @PostMapping(value = "/reminder" )
    public ResponseEntity<Reminder> create(@Valid  @RequestBody ReminderDto reminderDto){


        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        Reminder reminder=modelMapper.map(reminderDto,Reminder.class);

        return new ResponseEntity<>(reminderService.create(reminder), HttpStatus.CREATED);


    }

    @GetMapping("/reminders")

    public ResponseEntity<List<Reminder>> getAll(){

        return new ResponseEntity<>(reminderService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/reminder/{id}")

    public ResponseEntity<Reminder> getById(Long id){

        return new ResponseEntity<>(reminderService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/reminder")

    public ResponseEntity<Reminder> editById(@Valid @RequestBody Reminder reminder){


        return new ResponseEntity<>(reminderService.edit(reminder), HttpStatus.OK);


    }

    @DeleteMapping("/reminder/{id}")
    public void deleteById(@PathVariable Long id){
        reminderService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }

}
