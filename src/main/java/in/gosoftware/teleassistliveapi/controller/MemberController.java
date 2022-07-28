package in.gosoftware.teleassistliveapi.controller;


import in.gosoftware.teleassistliveapi.dto.MemberDto;
import in.gosoftware.teleassistliveapi.model.Member;
import in.gosoftware.teleassistliveapi.model.Reminder;
import in.gosoftware.teleassistliveapi.service.MemberServiceImpl;
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
public class MemberController {

    @Autowired
    MemberServiceImpl memberService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "/member" )
    public ResponseEntity<Member> create(@Valid  @RequestBody MemberDto memberDto){


        Member member=modelMapper.map(memberDto,Member.class);

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

    public ResponseEntity<Member> editById(@Valid @RequestBody Member member){


        return new ResponseEntity<>(memberService.edit(member), HttpStatus.OK);


    }

    @DeleteMapping("/member/{id}")
    public void deleteById(@PathVariable Long id){
        memberService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
