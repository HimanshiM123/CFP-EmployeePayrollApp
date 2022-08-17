package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.Exeption.EmployeeNotFoundException;
import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;
import com.bridgelabz.employeepayrollapp.repositpry.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @Override
    public EmployeeDepartment updateDepartment(DepartmentDTO departmentDTO, Long id) {
        Optional<EmployeeDepartment> isIdPresent = departmentRepository.findById(id);
        if (isIdPresent.isPresent()) {
            isIdPresent.get().setDepartmentName(departmentDTO.getDepartmentName());
            isIdPresent.get().setDepartmentDescription(departmentDTO.getDepartmentDesc());
            isIdPresent.get().setUpdatedTimeStamp(LocalDateTime.now());
            departmentRepository.save(isIdPresent.get());
            return isIdPresent.get();
        } else {
            throw new EmployeeNotFoundException(400, "Department is not found with this id");
        }
    }

    @Override
    public List<EmployeeDepartment> getAllDepartments() {
        List<EmployeeDepartment> isDepartment = departmentRepository.findAll();
        if (isDepartment.size() > 0) {
            return isDepartment;
        } else {
            throw new EmployeeNotFoundException(400, "No Departments Found");
        }
    }

    @Override
    public EmployeeDepartment deleteDepartment(Long id) {
        Optional<EmployeeDepartment> isIdPresent = departmentRepository.findById(id);
        if (isIdPresent.isPresent()) {
            departmentRepository.delete(isIdPresent.get());
            return isIdPresent.get();
        } else {
            throw new EmployeeNotFoundException(400, "Department is not found");
        }
    }
}
