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

    private String cmpid;

    private String template_name;

    private String template_body;
}
