package com.bridgelabz.employeepayrollapp.repositpry;

import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<EmployeeModel,Long> {
    Optional<EmployeeModel> findByEmailId(String email);
}
