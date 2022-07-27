package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customerlistreport")


public class CustomerListReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String list_name;
    @NotNull(message = "List id is Missing")
    private String listid;
    @NotNull
    private String customer_name;
    @NotNull
    private String customer_contact_no;
    private String customer_whatsapp_no;
    private String customer_location;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    @NotNull
    private String member_id;
    @NotNull
    private String member_name;
    @NotNull
    private String cmpid;
    @NotNull
    private String status;
    private String remarks;
}
