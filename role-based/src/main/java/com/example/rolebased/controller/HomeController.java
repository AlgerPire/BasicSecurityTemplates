package com.example.rolebased.controller;

import com.example.rolebased.model.Employee;
import com.example.rolebased.service.EmployeeAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private EmployeeAdd addEmployee;

    @GetMapping("/home")
    public String home(){
        return "This is Home Page (for all)";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin page (for all)";
    }

    @GetMapping("/user")
    public String user(){
        return "This is use page (for all)";
    }

    @PostMapping("/adminAdd")
    public Employee add(Employee employee){
        return addEmployee.addEmployee(employee);
    }
}
