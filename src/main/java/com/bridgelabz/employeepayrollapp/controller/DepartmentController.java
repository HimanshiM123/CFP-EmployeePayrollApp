package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.DepartmentDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;
import com.bridgelabz.employeepayrollapp.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    IDepartmentService departmentService;

    @PostMapping
    public EmployeeDepartment adddepartment(@RequestBody DepartmentDTO departmentDTO){
        return departmentService.addDepartment(departmentDTO);
    }

}
