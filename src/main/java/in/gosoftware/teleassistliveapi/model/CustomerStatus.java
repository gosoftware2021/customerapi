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
@RequiredArgsConstructor
public class CustomerStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Company Id is Missing")
    private String cmpid;
    @NotNull(message = "Status Name is Missing")
    private String status_name;
    @NotNull(message = "Status Color is Missing")
    private String status_color;
}
