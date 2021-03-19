package com.pelado.lukson.ejercicio2;

public class Employee {

    private String firstname;
    private String lastname;
    private int id;
    private double salary;

    public Employee()
    { }
    public Employee(String firstname, String lastname, int id, double salary)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double annualSalary()
    {
        return this.salary * 12;
    }

    public double addMoney(double percent)
    {
        return this.salary + (this.salary * percent) / 100;
    }
}
