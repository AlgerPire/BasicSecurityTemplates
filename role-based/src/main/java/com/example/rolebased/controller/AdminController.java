package com.example.rolebased.controller;

import com.example.rolebased.model.Employee;
import com.example.rolebased.service.EmployeeAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private EmployeeAdd employeeAdd;

    @GetMapping("/home")
    public String admin(){
        return "This is for admin";
    }

    @GetMapping("/admin")
    public String admin1(){
        return "This is for admin2";
    }





}
