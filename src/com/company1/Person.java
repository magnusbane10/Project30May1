package com.company1;

import java.awt.*;

public class Person implements Comparable {
    private int age;
    private String name;
    private String CNP;
    private Address address;

    public Person(int age, String name, String CNP, Address address) {
        this.age = age;
        this.name = name;
        this.CNP = CNP;
        this.address = address;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNrOfWorkedHours(){

        return 0;
    }
    public int getNrOfDaysWithoutWorkPerWeek() {

        return 0;
    }

    public String toString(){
        return this.name + " is " + this.age + " years old";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
