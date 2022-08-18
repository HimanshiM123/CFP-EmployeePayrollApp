package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;
import com.bridgelabz.employeepayrollapp.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    IDepartmentService departmentService;

    @PostMapping
    public EmployeeDepartment adddepartment(@Valid @RequestBody DepartmentDTO departmentDTO){
        return departmentService.addDepartment(departmentDTO);
    }
    @PutMapping("/updateDepartment/{id}")
    public EmployeeDepartment updateDepartment(@Valid @RequestBody DepartmentDTO departmentDTO,@PathVariable Long id){
        return departmentService.updateDepartment(departmentDTO,id);
    }
    @GetMapping("/getAllDepartments")
    public List<EmployeeDepartment> getAllDepartments(){

        return departmentService.getAllDepartments();
    }
    @DeleteMapping("/deleteDepartment/{id}")
    public EmployeeDepartment deleteDepartment(@PathVariable Long id){

        return departmentService.deleteDepartment(id);
    }

}
