package com.employeeManagement.Employee.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="tblPersonalMaster")
public class PersonalMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    Long employeesId;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="birth_date")
    LocalDate dateOfBirth;
    @Column(name="gender")
    String gender;
}
