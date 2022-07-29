package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private String mobile;

    private String email;

    private String password;
    private boolean active;
    private String roles;


}
