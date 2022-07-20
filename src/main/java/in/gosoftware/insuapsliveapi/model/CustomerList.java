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
@Table(name = "customerlist")
public class CustomerList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String list_name;
    @OneToMany( mappedBy = "customerlist",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CustomerDetails> customerDetailsList;

}
