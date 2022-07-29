package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;


@Data
@NoArgsConstructor
@Getter
@Setter

public class MemberDto  {

    @NotBlank(message = "Name not found")
    @NotNull
    private String name;
    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    @NotNull
    @Email
    private String email;
    @NotBlank
    @Length(min = 6,message = "Password should be min six digit ")
    // @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$",message = "invalid pasword entered ")
    private String password;
    private boolean active;



}
