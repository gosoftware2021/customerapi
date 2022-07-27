package in.gosoftware.teleassistliveapi.controller;


import in.gosoftware.teleassistliveapi.model.Member;
import in.gosoftware.teleassistliveapi.model.Reminder;
import in.gosoftware.teleassistliveapi.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberServiceImpl memberService;

    @PostMapping(value = "/member" )
    public ResponseEntity<Member> create(@RequestBody Member member){


        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        return new ResponseEntity<>(memberService.create(member), HttpStatus.CREATED);


    }

    @GetMapping("/members")

    public ResponseEntity<List<Member>> getAll(){

        return new ResponseEntity<>(memberService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/member/{id}")

    public ResponseEntity<Optional<Member>> getById(@PathVariable Long id){

        return new ResponseEntity<>(memberService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/member")

    public ResponseEntity<Member> editById(@RequestBody Member member){


        return new ResponseEntity<>(memberService.edit(member), HttpStatus.OK);


    }

    @DeleteMapping("/member/{id}")
    public void deleteById(@PathVariable Long id){
        memberService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
