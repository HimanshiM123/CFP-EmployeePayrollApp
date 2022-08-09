package com.bridgelabz.employeepayrollapp.repositpry;

import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
