package in.gosoftware.teleassistliveapi.controller;



import in.gosoftware.teleassistliveapi.dto.TeamDto;
import in.gosoftware.teleassistliveapi.model.Team;
import in.gosoftware.teleassistliveapi.service.TeamServiceImpl;
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
public class TeamController {


    @Autowired
    TeamServiceImpl teamService;

    @Autowired
    ModelMapper modelMapper;
    @PostMapping(value = "/team" )
    public ResponseEntity<Team> create(@Valid  @RequestBody TeamDto teamDto){


        Team team=modelMapper.map(teamDto,Team.class);

        //appointmentService.create(appointment);

        // Appointment appointment1=new Appointment();
        // appointment1.setCmpid("123456789");

        return new ResponseEntity<>(teamService.create(team), HttpStatus.CREATED);


    }

    @GetMapping("/teams")

    public ResponseEntity<List<Team>> getAll(){

        return new ResponseEntity<>(teamService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/team/{id}")

    public ResponseEntity<Optional<Team>> getById(@PathVariable Long id){

        return new ResponseEntity<>(teamService.getById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping("/team")

    public ResponseEntity<Team> editById(@Valid @RequestBody Team team){


        return new ResponseEntity<>(teamService.edit(team), HttpStatus.OK);


    }

    @DeleteMapping("/team/{id}")
    public void deleteById(@PathVariable Long id){
        teamService.delete(id);
        //  return new ResponseEntity<>(appointmentService.delete(id),HttpStatus.OK);
    }
}
