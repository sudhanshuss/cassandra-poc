package com.sid.repository;

import org.springframework.data.repository.CrudRepository;

import com.sid.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
