package in.gosoftware.teleassistliveapi.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@Getter
@Setter


public class Team {


    private String name;


    private List<Member> memberList;
    private String location;
}
