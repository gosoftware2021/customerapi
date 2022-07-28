package in.gosoftware.teleassistliveapi.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter

public class CustomerCall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String list_name;

    private String listid;
    private String customer_name;

    private String customer_contact_no;
    private String customer_whatsapp_no;
    private String customer_location;

    private String member_id;

    private String member_name;

    private String cmpid;
    private String callduration;
    private String calltime;
}
