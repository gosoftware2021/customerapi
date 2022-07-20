package in.gosoftware.insuapsliveapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
