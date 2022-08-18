package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDto;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String department;
    private long salary;
    private String emailId;
   private LocalDate joiningDate;
   private String profilePic;
   private String note;


    public EmployeeModel(EmployeeDto employeeDto){
        this.firstName=employeeDto.getFirstName();
        this.lastName=employeeDto.getLastName();
        this.gender= employeeDto.getGender();
        this.department=employeeDto.getDepartment();
        this.salary= employeeDto.getSalary();
        this.emailId=employeeDto.getEmailId();
        this.joiningDate=employeeDto.getJoiningDate();
        this.profilePic=employeeDto.getProfilePic();
        this.note=employeeDto.getNote();

    }
    public EmployeeModel() {

    }
}
