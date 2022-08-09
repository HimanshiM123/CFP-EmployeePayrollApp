package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDto;
import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {
    EmployeeModel addemployee(EmployeeDto employeeDto);
}
