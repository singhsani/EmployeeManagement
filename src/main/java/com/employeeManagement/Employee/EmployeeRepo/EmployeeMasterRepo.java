package com.employeeManagement.Employee.EmployeeRepo;

import com.employeeManagement.Employee.Model.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster,Long> {
}
