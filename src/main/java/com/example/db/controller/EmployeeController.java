package com.example.db.controller;



import com.example.db.dao.EmployeeDao;
import com.example.db.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/getEmp")
    public List<Employees> getAllEmployees(){
        return employeeDao.getEmployees();
    }

}
