package com.bridgelabz.employeepayrollapp.Exeption.exceptionhandler;

import com.bridgelabz.employeepayrollapp.Exeption.EmployeeNotFoundException;
import com.bridgelabz.employeepayrollapp.Util.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Response> handleHiringException(EmployeeNotFoundException he){
        Response response=new Response();
        response.setErrorCode(400);
        response.setMessage(he.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
