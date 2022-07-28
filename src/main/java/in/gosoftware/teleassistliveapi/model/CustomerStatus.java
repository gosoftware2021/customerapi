package in.gosoftware.teleassistliveapi.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customerstatus")

public class CustomerStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cmpid;

    private String status_name;

    private String status_color;
}
