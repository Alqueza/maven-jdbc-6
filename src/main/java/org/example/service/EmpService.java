package org.example;

import org.example.model.Employee;

import java.util.List;

public interface EmpService {
    void createEmployee();
    String addEmployee();
    void dropTable();
    void cleanTable();
    void alterTable();
    Employee updateEmp(Employee employee);
    List<Employee> getAllEmployee(List<Employee> employees);
    List<Employee> sortTable();
}
