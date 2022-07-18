package org.example.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String email;
    private int age;

    public Employee(String firstName, String lastName, String country, String gender, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.gender = gender;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
