package com.example.db.dao;

import com.example.db.model.Employees;
import com.example.db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employees> getEmployees(){

        return employeeRepository.findAll();
    }



    //INSERT INTO employees(id, email_address, first_name, last_name) VALUES (1, 'ravi@gmail.com', 'ravikumar', 'lakkakula');
    //INSERT INTO employees(id, email_address, first_name, last_name) VALUES (2, 'vasu@gmail.com', 'vasantha', 'sunkari');
    //INSERT INTO employees(id, email_address, first_name, last_name) VALUES (3, 'dakshith@gmail.com', 'dakshit', 'lakkakula');
    //INSERT INTO employees(id, email_address, first_name, last_name) VALUES (4, 'danvith@gmail.com', 'danvith', 'lakkakula');
}
