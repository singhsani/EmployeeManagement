package com.employeeManagement.Employee.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="qualification_master")
public class QualificationMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="qualicfication_id")
    Long qualificationId;
    @NonNull
    @Column(name="qualification")
    String qualification;
}
