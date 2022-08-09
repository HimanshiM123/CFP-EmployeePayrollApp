package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.Exeption.EmployeeNotFoundException;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDto;
import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import com.bridgelabz.employeepayrollapp.repositpry.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    IEmployeeRepository employeeRepository;
    @Override
    public EmployeeModel addemployee(EmployeeDto employeeDto) {
        EmployeeModel employeeModel = new EmployeeModel(employeeDto);
        employeeModel.setRegisteredDate(LocalDateTime.now());
        employeeRepository.save(employeeModel);
        return employeeModel;
    }
    @Override
    public EmployeeModel updateEmployee(long id, EmployeeDto employeeDto) {
        Optional<EmployeeModel> isEmployeePresent = employeeRepository.findById(id);
        if(isEmployeePresent.isPresent()){
            isEmployeePresent.get().setFirstName(employeeDto.getFirstName());
            isEmployeePresent.get().setLastName(employeeDto.getLastName());
            isEmployeePresent.get().setCompanyName(employeeDto.getCompanyName());
            isEmployeePresent.get().setDepartment(employeeDto.getDepartment());
            isEmployeePresent.get().setSalary(employeeDto.getSalary());
            isEmployeePresent.get().setUpdatedDate(LocalDateTime.now());
            employeeRepository.save(isEmployeePresent.get());
            return isEmployeePresent.get();

        }
        throw new EmployeeNotFoundException(400,"Employee Not Present!!");
    }

    @Override
    public List<EmployeeModel> getEmpData() {
        List<EmployeeModel> getAllEmployee = employeeRepository.findAll();
        if(getAllEmployee.size()>0)
            return getAllEmployee;
        else
            throw new EmployeeNotFoundException(400,"No DATA Present");
    }
    @Override
    public EmployeeModel deleteEmployee(Long id) {
        Optional<EmployeeModel> isEmployeePresent=employeeRepository.findById(id);
        if(isEmployeePresent.isPresent()){
            employeeRepository.delete(isEmployeePresent.get());
            return isEmployeePresent.get();
        }
        throw new EmployeeNotFoundException(400,"Employee Not Present");
    }
}
