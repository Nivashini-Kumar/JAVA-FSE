package com.bluee.spring_learn.controller;

import com.bluee.spring_learn.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @RequestBody Employee employee) {

        employee.setId(id);
        return employee;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Employee with ID " + id + " deleted successfully.";
    }
}