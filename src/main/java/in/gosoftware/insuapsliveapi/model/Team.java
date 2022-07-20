package in.gosoftware.insuapsliveapi.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "team",fetch = FetchType.LAZY,cascade = CascadeType.ALL)

    private List<Member> memberList;
    private String location;
}
