package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class DepartmentDTO {
    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Department Name")
    private String departmentName;
    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Department Description")
    private String departmentDesc;
}
