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



public class CustomerTemplateDto {

     @NotNull(message = "Company Id is Missing")
    private String cmpid;
    @NotNull(message = "Template Name is Missing")
    private String template_name;
     @NotNull(message = "Template Body is Missing")
    private String template_body;
}
