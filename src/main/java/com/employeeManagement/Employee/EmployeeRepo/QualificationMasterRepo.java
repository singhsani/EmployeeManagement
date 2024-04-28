package com.employeeManagement.Employee.EmployeeRepo;

import com.employeeManagement.Employee.Model.QualificationMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationMasterRepo extends JpaRepository<QualificationMaster,Long> {
}
