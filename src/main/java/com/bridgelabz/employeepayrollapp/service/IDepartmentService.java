package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;

public interface IDepartmentService {
    EmployeeDepartment addDepartment(DepartmentDTO departmentDTO);
}
