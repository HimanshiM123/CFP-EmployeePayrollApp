package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.Util.Response;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDto;
import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeService {
    EmployeeModel addemployee(EmployeeDto employeeDto);

    EmployeeModel updateEmployee(long id, EmployeeDto employeeDto);

    List<EmployeeModel> getEmpData(String token);

    EmployeeModel deleteEmployee(Long id);

    Response login(String email, String password);
}
