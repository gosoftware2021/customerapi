package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@Getter
@Setter

public class MemberDto extends UserDto {


    private boolean active;
    private boolean crm;
    private boolean skip_call;

    private TeamDto team;
}
