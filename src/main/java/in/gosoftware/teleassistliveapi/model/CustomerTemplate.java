package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customertemplate")


public class CustomerTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @NotNull(message = "Company Id is Missing")
    private String cmpid;
    @NotNull(message = "Template Name is Missing")
    private String template_name;
     @NotNull(message = "Template Body is Missing")
    private String template_body;
}
