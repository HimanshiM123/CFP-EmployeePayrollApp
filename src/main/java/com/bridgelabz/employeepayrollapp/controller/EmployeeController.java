package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDto;
import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import com.bridgelabz.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @PostMapping("/addemployee")
    public EmployeeModel addemployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addemployee(employeeDto);
    }
    @PutMapping("updateEmployee/{id}")
    public EmployeeModel updateemployee(@RequestBody EmployeeDto employeeDto, @PathVariable long id){
        return employeeService.updateEmployee(id,employeeDto);
    }
    @GetMapping("getEmployeedata")
    public List<EmployeeModel> getAllEmployee(){
        return employeeService.getEmpData();
    }

    @DeleteMapping("deleteEmployee/{id}")
    public EmployeeModel deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
