package com.example.rolebased.service;

import com.example.rolebased.model.Employee;
import com.example.rolebased.model.EmployeeDetails;
import com.example.rolebased.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomEmployeeDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findEmployeeByUsername(username);

        if(employee==null){
            throw new UsernameNotFoundException("Username not found");
        }

        return new EmployeeDetails(employee);
    }
}
