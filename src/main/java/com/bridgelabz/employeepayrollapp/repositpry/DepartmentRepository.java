package com.bridgelabz.employeepayrollapp.repositpry;

import com.bridgelabz.employeepayrollapp.model.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<EmployeeDepartment,Long> {
}
