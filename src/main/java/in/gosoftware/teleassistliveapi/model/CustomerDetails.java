package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor

public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Customer Name Not found")
    private String name;
    @NotNull(message = "Customer Mobile no. Not found")
    private String cust_mb;
    @ManyToOne

    private CustomerList customerlist;





}
