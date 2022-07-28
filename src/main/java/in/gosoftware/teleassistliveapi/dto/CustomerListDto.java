package in.gosoftware.teleassistliveapi.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@NoArgsConstructor
@Getter
@Setter


public class CustomerListDto {


    @NotNull(message = "Customer List Name Not found")
    private String list_name;

    private List<CustomerDetailsDto> customerDetailsList;

}
