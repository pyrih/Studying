package org.pyrih.zaur.ionio.dev1;

import java.io.Serializable;

public class Employee implements Serializable {
    final static long serialVersionUID = 2;
    private String name;
    private String surname;
    private String department;
    private int age;
    transient private double salary;
    Car car;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

    public Employee(String name, String surname, String department, int age, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.surname = "Default";
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }
}
