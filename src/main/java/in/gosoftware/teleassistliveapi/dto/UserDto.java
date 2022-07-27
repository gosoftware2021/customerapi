package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Data
@NoArgsConstructor

@Getter
@Setter


public class UserDto {


    private Long id;
    @NotBlank(message = "Name not found")
    private String name;
    @Pattern(regexp = "^\\\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$",message = "Enter Valid Email Id")
    private String email;
    @NotBlank
   // @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$",message = "invalid pasword entered ")
    private String password;
}
