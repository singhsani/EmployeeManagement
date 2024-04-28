package com.employeeManagement.Employee.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class EmployeeBaseDTO
{

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Double salary;
    private LocalDate joiningDate;
    private String qualification;
    private Boolean isFreser;
    private String gender;

}
