package com.example.rolebased.repo;

import com.example.rolebased.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findEmployeeByUsername(String username);

}
