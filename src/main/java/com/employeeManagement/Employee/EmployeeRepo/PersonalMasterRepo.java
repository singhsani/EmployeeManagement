package com.employeeManagement.Employee.EmployeeRepo;

import com.employeeManagement.Employee.Model.PersonalMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalMasterRepo extends JpaRepository<PersonalMaster,Long> {
}
