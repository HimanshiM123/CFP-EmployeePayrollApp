package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;
import com.bridgelabz.employeepayrollapp.repositpry.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
   @Override
   public EmployeeDepartment addDepartment(DepartmentDTO departmentDTO){
        EmployeeDepartment employeeDepartment=new EmployeeDepartment();
        employeeDepartment.setDepartmentName(departmentDTO.getDepartmentName());
        employeeDepartment.setDepartmentDescription(departmentDTO.getDepartmentDesc());
        employeeDepartment.setCreatedTimeStamp(LocalDateTime.now());
        departmentRepository.save(employeeDepartment);
        return employeeDepartment;
    }
}
