package com.employeeManagement.Employee.Service;

import com.employeeManagement.Employee.DTO.EmployeeBaseDTO;
import com.employeeManagement.Employee.EmployeeRepo.EmployeeMasterRepo;
import com.employeeManagement.Employee.EmployeeRepo.PersonalMasterRepo;
import com.employeeManagement.Employee.EmployeeRepo.QualificationMasterRepo;
import com.employeeManagement.Employee.Model.EmployeeMaster;
import com.employeeManagement.Employee.Model.PersonalMaster;
import com.employeeManagement.Employee.Model.QualificationMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    PersonalMasterRepo personalRepo;
    @Autowired
    QualificationMasterRepo qualificationMasterRepo;
    @Autowired
    EmployeeMasterRepo employeeMasterRepo;
    public void saveData(EmployeeBaseDTO employeeBaseDTO){
        PersonalMaster personalMaster =new PersonalMaster();
        personalMaster.setDateOfBirth(employeeBaseDTO.getDateOfBirth());
        personalMaster.setFirstName(employeeBaseDTO.getFirstName());
        personalMaster.setLastName(employeeBaseDTO.getLastName());
        personalMaster.setGender(employeeBaseDTO.getGender());
        personalRepo.save(personalMaster);
        QualificationMaster qualificationMaster=new QualificationMaster();
        qualificationMaster.setQualification(employeeBaseDTO.getQualification());
        qualificationMasterRepo.save(qualificationMaster);
        EmployeeMaster employeeMaster=new EmployeeMaster();
        employeeMaster.setPersonalMaster(personalMaster);
        employeeMaster.setQualificationMaster(qualificationMaster);
        employeeMaster.setSalary(employeeBaseDTO.getSalary());
        employeeMaster.setIsFresher(employeeBaseDTO.getIsFreser());
        employeeMaster.setJoinningDate(employeeBaseDTO.getJoiningDate());
        employeeMasterRepo.save(employeeMaster);

    }
}
