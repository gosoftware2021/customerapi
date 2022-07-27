package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Getter
@Setter


public class CustomerDetails {



    @NotNull(message = "Customer Name Not found")
    private String name;
    @NotNull(message = "Customer Mobile no. Not found")
    private String cust_mb;
    @ManyToOne

    private CustomerList customerlist;





}
