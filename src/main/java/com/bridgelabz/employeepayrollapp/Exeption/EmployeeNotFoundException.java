package com.bridgelabz.employeepayrollapp.Exeption;

public class EmployeeNotFoundException extends RuntimeException {
    private int statusCode;
    private String statusMessage;
    public EmployeeNotFoundException(int statusCode, String statusMessage) {
        super(statusMessage);
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
}
