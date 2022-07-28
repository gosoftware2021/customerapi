package in.gosoftware.teleassistliveapi.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customerlist")

public class CustomerList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String list_name;
    @OneToMany( mappedBy = "customerlist",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CustomerDetails> customerDetailsList;

}
