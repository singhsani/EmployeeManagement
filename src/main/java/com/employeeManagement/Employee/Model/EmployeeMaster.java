package com.employeeManagement.Employee.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employee_master")
public class EmployeeMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    @OneToOne
    @JoinColumn(name = "employee_id")
    PersonalMaster personalMaster;
    @Column(name="joinning_date")
    LocalDate joinningDate;
    @Column(name="salary")
    Double salary;
    @OneToOne
    @JoinColumn(name="qualification_id")
    QualificationMaster qualificationMaster;
    @Column(name="is_fresher")
    Boolean isFresher=false;
}
