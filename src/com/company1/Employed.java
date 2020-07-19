package com.company1;

import java.awt.*;

public class Employed extends Person {
    private Company company;
    private int salary;

    public Employed(int age, String name, String CNP, Address address, Company company, int salary) {
        super(age, name, CNP, address);
        this.company = company;
        this.salary = salary;
    }

    public Employed(Company company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public Employed() {
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getNrOfWorkedHours() {
        return 40;
    }

    @Override
    public int getNrOfDaysWithoutWorkPerWeek() {
        return 2;
    }
}
