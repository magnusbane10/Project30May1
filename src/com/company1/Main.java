package com.company1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> peopleNamesEmployed = new ArrayList<>();
        peopleNamesEmployed.add("Stefan Andrei");
        peopleNamesEmployed.add("Juan Esteban");
        peopleNamesEmployed.add("El Capitan");
        peopleNamesEmployed.add("Gabriel Eduard");
        peopleNamesEmployed.add("Marius Palade");
        peopleNamesEmployed.add("Marius Palade");
        System.out.println(peopleNamesEmployed.toString());
        System.out.println(peopleNamesEmployed.size());




        Country country = new Country("Romania", "RO", true);
        Country country1 = new Country("Spain", "SPN", true);

        Company company = new Company(country, " EvgheniaInternational");
        Company company1 = new Company(country1, " SDAcademy");

        Address addressE = new Address(country, "Iasi", "700100");
        Address addressE1 = new Address(country1, "Ibiza", "13700158");

        Address addressS = new Address(country, "Bacau", "734100");
        Address addressS1 = new Address(country1, "Madrid", "13743158");

        Address addressU = new Address(country, "Bucharest", "734340");
        Address addressU1 = new Address(country1, "Barcelona", "1374df438");


        Employed employed = new Employed(36, "Stefan Andrei", "1840503226859", addressE, company, 2000);
        Employed employed1 = new Employed(32, "Juan Esteban", "1880556926859", addressE1, company1, 3200);

        Faculty faculty = new Faculty(country, "Al.I.Cuza", "Economie");
        Faculty faculty1 = new Faculty(country, "University of Barcelona", "Bank Management");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(22, "Matei Fedor", "19805039268533", addressS, faculty, 3));
        list.add(new Student(19, "Carlos Medina", "1020556762909", addressS1, faculty1, 1));
        list.add(new Student(23, "Gilbert Morris", "102050445", addressS1, faculty1, 1));
        list.add(new Student(20, "Jason Statam", "1020213d09", addressS1, faculty1, 1));
        System.out.println(list.get(3));
        System.out.println(list.toString());


        Student student = new Student(22, "Matei Fedor", "1980503926859", addressS, faculty, 3);
        Student student1 = new Student(19, "Carlos Medina", "1020503262909", addressS1, faculty1, 1);
        System.out.println(student.toString());
        Unemployed unemployed = new Unemployed(42, "Camataru Ion", "1780404228739", addressU, true, "Arhitect");
        Unemployed unemployed1 = new Unemployed(39, "Miguel Randosa", "1810404228739", addressU1, true, "Carpenter");

        Set<Employed> employeeList = new HashSet<>();
        employeeList.add(new Employed(36, "Stefan Andrei", "1840503226859", addressE, company, 2000));
        employeeList.add(new Employed(32, "Juan Esteban", "1880556926859", addressE1, company1, 3200));
        employeeList.add(new Employed(28, "Maroon Andrei", "1840523226859", addressE, company, 2800));
        employeeList.add(new Employed(39, "Little Andrei", "1840556226859", addressE, company, 2500));







        /*System.out.println(employed.getName() + " Work for " + employed.getCompany().getCompanyName() + ". A company from " +
                employed.getAddress().getCountry().getCountryName() + "," + employed.getAddress().getCity() + " and get a salary of " +
                employed.getSalary() + " euro." + " si a lucrat: " + employed.getNrOfWorkedHours());

        System.out.println(employed1.getName() + " Work for " + employed1.getCompany().getCompanyName() + ". A company from " +
                employed1.getAddress().getCountry().getCountryName() + "," + employed1.getAddress().getCity() + " and get a salary of " +
                employed1.getSalary() + " euro." + " si a lucrat: " + employed1.getNrOfWorkedHours());

        System.out.println(student.getName() + " este student in anul " + student.getStudyYear() + " la univeritatea " +
                student.getFaculty().getUniversity() +
                " profilul " + student.getFaculty().getFacultyName() + " din " + student.getFaculty().getCountry().getCountryName() + "," +
                student.getAddress().getCity() + "." + " In timpul liber lureaza alte " + student.getNrOfWorkedHours() + " de ore pe saptamana. ");

        System.out.println(student1.getName() + " este student in anul " + student1.getStudyYear() + " la univeritatea " +
                student1.getFaculty().getUniversity() +
                " profilul " + student1.getFaculty().getFacultyName() + " din " + student1.getAddress().getCountry().getCountryName() + "," +
                student1.getAddress().getCity() + "." + " In timpul liber lureaza alte " + student1.getNrOfWorkedHours() + " de ore pe saptamana. ");

        System.out.println(unemployed.getName() + " it is " + unemployed.isFreeTime() + " that you have " +
                unemployed.getNrOfDaysWithoutWorkPerWeek() + " days of free time per week?");

        System.out.println(unemployed1.getName() + " it is " + unemployed1.isFreeTime() + " that you have " +
                unemployed1.getNrOfDaysWithoutWorkPerWeek() + " days of free time per week?");

        System.out.println(student.toString());
        System.out.println(employed.toString());
        System.out.println(unemployed.toString());

        System.out.println(faculty.toString());

        System.out.println(list);*/

    }
}
