package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor

@Getter
@Setter
@Table(name = "user_details")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
