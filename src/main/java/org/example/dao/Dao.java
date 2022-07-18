package org.example.dao;

import org.example.model.Employee;

import java.util.List;

public interface Dao {
    void createEmployeeTable();
    String addEmployee(Employee employee);
    void dropTable();
    void cleanTable();
    void alterTable();
    Employee updateEmp(Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> sortTable();

}
