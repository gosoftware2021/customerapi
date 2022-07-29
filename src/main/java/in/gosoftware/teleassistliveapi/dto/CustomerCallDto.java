package in.gosoftware.teleassistliveapi.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Getter
@Setter

public class CustomerCallDto {

    @NotNull
    private String list_name;
    @NotNull
    private String listid;
    private String customer_name;
    @NotNull
    private String customer_contact_no;
    private String customer_whatsapp_no;
    private String customer_location;
    @NotNull
    private String member_id;
    @NotNull
    private String member_name;
    @NotNull
    private String cmpid;
    private String callduration;
    private String calltime;
}
