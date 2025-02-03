package com.javafullstack.demo.service.Impl;

import com.javafullstack.demo.entity.Employee;
import com.javafullstack.demo.repository.EmployeeRepository;
import com.javafullstack.demo.service.EmployeeService;
import jakarta.persistence.OptimisticLockException;
import lombok.AllArgsConstructor;
import org.hibernate.StaleObjectStateException;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl{
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee createEmployee(@RequestBody Employee employee) {
        if (employee.getEmail() == null || employee.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        try {
            return employeeRepository.save(employee);
        } catch (OptimisticLockException | StaleObjectStateException ex) {
            // Log the excepti
            System.out.println("The employee record was modified by another process. Please try again.");
            return null;
        }
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
