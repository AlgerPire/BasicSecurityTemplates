package com.example.rolebased.service;

import com.example.rolebased.model.Employee;
import com.example.rolebased.repo.EmployeeRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeAdd {


    PasswordEncoder passwordEncoder;
    private EmployeeRepository employeeRepository;

    public EmployeeAdd(EmployeeRepository employeeRepository) {
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        String encryptedPassword=this.passwordEncoder.encode(employee.getPassword());
        employee.setPassword(encryptedPassword);
        return employeeRepository.save(employee);
    }

}
