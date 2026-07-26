package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}