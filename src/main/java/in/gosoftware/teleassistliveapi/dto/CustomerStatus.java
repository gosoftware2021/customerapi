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


public class CustomerStatus {


    @NotNull(message = "Company Id is Missing")
    private String cmpid;
    @NotNull(message = "Status Name is Missing")
    private String status_name;
    @NotNull(message = "Status Color is Missing")
    private String status_color;
}
