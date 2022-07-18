package org.example.dao;

import org.example.config.Config;
import org.example.model.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DaoImplement implements Dao{

    private final Config config = new Config();
    @Override
    public void createEmployeeTable() {
        String createTable = "create table if not exists employee("+
                "id serial primary key," +
                "first_name varchar," +
                "last_name varchar," +
                "country varchar," +
                "gender varchar," +
                "email varchar unique," +
                "age int)";
        try (Connection connection = Config.getConnection();
            Statement statement = connection.createStatement()){
            System.out.println(statement.executeUpdate(createTable));
            System.out.println("table created");
        }catch (SQLException e){
            System.err.println("NOT CREATED");
        }
    }

    @Override
    public String addEmployee(Employee employee) {
        String addEmployee = "insert into employee(first_name, last_name, country, gender, email, age)" +
                "Values ('Adilet','Otorbaev','Kyrgyzstan','Male','Adilet@mail.ru',18)";
        try (Connection connection = Config.getConnection();
             Statement statement = connection.createStatement()){
            System.out.println(statement.executeUpdate(addEmployee));
            System.out.println("employee added");
        }catch (SQLException e){
            System.err.println("NOT ADDED!");
        }

        return null;
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
