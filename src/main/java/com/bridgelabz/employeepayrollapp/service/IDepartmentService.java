package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;

import java.util.List;

public interface IDepartmentService {
    EmployeeDepartment addDepartment(DepartmentDTO departmentDTO);

    EmployeeDepartment updateDepartment(DepartmentDTO departmentDTO, Long id);

    List<EmployeeDepartment> getAllDepartments();

    EmployeeDepartment deleteDepartment(Long id);
}
