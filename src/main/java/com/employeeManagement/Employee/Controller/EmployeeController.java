package com.employeeManagement.Employee.Controller;

import com.employeeManagement.Employee.DTO.EmployeeBaseDTO;
import com.employeeManagement.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String print(){
        return "Hellow World";
    }
    @PostMapping(value="/addDetail")
    public ResponseEntity<String> saveData(@RequestBody EmployeeBaseDTO employeeBaseDTO){
        employeeService.saveData(employeeBaseDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
