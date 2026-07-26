package com.cognizant.orm_learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.orm_learn.model.entity.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;

@Component
public class ManyToOneRunner implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public ManyToOneRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {

        System.out.println("===== MANY TO ONE MAPPING =====");

        Employee employee = employeeRepository.findById(101).get();

        System.out.println("Employee Name : " + employee.getName());
        System.out.println(
            "Department : " + employee.getDepartment().getName()
        );
    }
}
