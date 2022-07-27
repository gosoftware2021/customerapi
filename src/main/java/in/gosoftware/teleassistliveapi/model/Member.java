package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter

public class Member extends User{


    private boolean active;
    private boolean crm;
    private boolean skip_call;
    @ManyToOne
    private Team team;
}
