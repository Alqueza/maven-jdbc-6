package org.example.service;

import org.example.dao.Dao;
import org.example.dao.DaoImplement;
import org.example.model.Employee;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    private final Dao dao = new DaoImplement();

    @Override
    public void createEmployeeTable() {
        dao.createEmployeeTable();
    }

    @Override
    public String addEmployee(Employee employee) {
        return dao.addEmployee(employee);
    }

    @Override
    public void dropTable() {

    }

    @Override
    public void cleanTable() {

    }

    @Override
    public void alterTable() {

    }

    @Override
    public Employee updateEmp(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public List<Employee> sortTable() {
        return null;
    }
}
