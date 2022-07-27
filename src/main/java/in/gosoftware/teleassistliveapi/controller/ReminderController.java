package in.gosoftware.teleassistliveapi.controller;
import in.gosoftware.teleassistliveapi.model.Reminder;
import in.gosoftware.teleassistliveapi.service.ReminderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReminderController {

    @Autowired
    ReminderServiceImpl reminderService;
    @PostMapping(value = "/reminder" )
    public ResponseEntity<Reminder> create(@RequestBody Reminder reminder){


        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        return new ResponseEntity<>(reminderService.create(reminder), HttpStatus.CREATED);


    }

    @GetMapping("/reminders")

    public ResponseEntity<List<Reminder>> getAll(){

        return new ResponseEntity<>(reminderService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/reminder/{id}")

    public ResponseEntity<Optional<Reminder>> getById(Long id){

        return new ResponseEntity<>(reminderService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/reminder")

    public ResponseEntity<Reminder> editById(@RequestBody Reminder reminder){


        return new ResponseEntity<>(reminderService.edit(reminder), HttpStatus.OK);


    }

    @DeleteMapping("/reminder/{id}")
    public void deleteById(@PathVariable Long id){
        reminderService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }

}
