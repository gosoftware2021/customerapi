package in.gosoftware.teleassistliveapi.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {

    private String msg;
    private HttpStatus status;
    private Date date;


}
