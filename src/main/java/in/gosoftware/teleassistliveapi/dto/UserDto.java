package in.gosoftware.teleassistliveapi.dto;

import lombok.*;

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
    @Email
    private String email;
    @NotBlank
    @Min(value = 6,message = "Password should be min six digit ")
   // @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$",message = "invalid pasword entered ")
    private String password;
}
