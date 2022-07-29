package in.gosoftware.teleassistliveapi.dto;

import in.gosoftware.teleassistliveapi.validation.ValidEmail;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;


@Data
@NoArgsConstructor

@AllArgsConstructor


public class UserDto {


    private Long id;
    @NotBlank(message = "Name not found")
    @NotNull
    private String name;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    @NotNull
    @ValidEmail
    private String email;
    @NotBlank
    @Length(min = 6,message = "Password should be min six digit " )
    //@Min(value = 6,message = "Password should be min six digit ")
   // @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$",message = "invalid pasword entered ")
    private String password;
}
