package in.gosoftware.teleassistliveapi.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Data
@NoArgsConstructor
@Getter
@Setter


public class TeamDto {


    private String name;


    private List<MemberDto> memberList;
    private String location;
}
