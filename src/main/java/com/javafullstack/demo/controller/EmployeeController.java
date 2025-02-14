package com.javafullstack.demo.controller;

import com.javafullstack.demo.entity.Employee;
import com.javafullstack.demo.service.Impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    //Building Add Employee Rest API
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getEmployees(){
        List<Employee> ans = employeeService.getEmployees();
        if(ans!=null && !ans.isEmpty()){
            return new ResponseEntity<>(ans,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping
    public ResponseEntity<?> updateEmployee(){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
