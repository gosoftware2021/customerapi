package in.gosoftware.teleassistliveapi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
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

    @Override
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {


        ApiError apiError=new ApiError(ex.getMessage(),HttpStatus.METHOD_NOT_ALLOWED,new Date());
       // ApiException apiException=new ApiException(HttpStatus.METHOD_NOT_ALLOWED,new Date(),ex.getMessage(),)
        Map<String ,Object> map=new HashMap<>();
        map.put("errors",apiError);

        return new ResponseEntity<>(apiError,HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(NoDataFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleException(NoDataFoundException apexp){

        List<String> errorList=new ArrayList<>();
        errorList.add(apexp.getLocalizedMessage());

        ApiException apiException=new ApiException(HttpStatus.NOT_FOUND,new Date(),"Data Not Found",errorList);

        return new ResponseEntity<>(apiException,HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleException(Exception ex){

        List<String> errorList=new ArrayList<>();
        errorList.add(ex.getLocalizedMessage());

        ApiException apiException=new ApiException(HttpStatus.BAD_REQUEST,new Date(),"Server error",errorList);

        return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(NoHandlerFoundException.class)
//    @ResponseStatus(code=HttpStatus.BAD_REQUEST)
//    public ResponseEntity<Object> badRequest(Exception e, HttpServletRequest request, HttpServletResponse response) {
//       // e.printStackTrace();
//        ApiError apiError=new ApiError(e.getLocalizedMessage(),HttpStatus.BAD_REQUEST,new Date());
//        return new ResponseEntity<>(apiError,HttpStatus.BAD_REQUEST);
//    }



}
