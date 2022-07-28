package in.gosoftware.teleassistliveapi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j(topic = "GLOBAL_EXCEPTION_HANDLER")
@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {


//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException ex){
//
//        Map<String,String> errorMap=new HashMap<>();
//
//        ex.getBindingResult().getFieldErrors().stream().collect(Collectors.)
////        ex.getBindingResult().getFieldErrors().forEach(err->{
////
////            errorMap.put(err.getField(),err.getDefaultMessage());
////        });
//        return errorMap;
//    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        Map<String ,Object> errors=new HashMap<>();

      List<String> errorlist=  ex.getBindingResult().getFieldErrors()
                .stream()
                .map(e->e.getDefaultMessage())
                .collect(Collectors.toList());

        errors.put("errors",errorlist);

        return new ResponseEntity<>(errors,HttpStatus.OK);

        //return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }
}
