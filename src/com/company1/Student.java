package com.company1;

public class Student extends Person {
    private Faculty faculty;
    private int studyYear;



    public Student(int age, String name, String CNP, Address address, Faculty faculty, int studyYear) {
        super(age, name, CNP, address);
        this.faculty = faculty;
        this.studyYear = studyYear;
    }

    public Student(Faculty faculty, int studyYear) {
        this.faculty = faculty;
        this.studyYear = studyYear;

    }

    public Student() {

    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {

        this.studyYear = studyYear;
    }

    @Override
    public int getNrOfWorkedHours() {
        return 20;
    }

    @Override
    public int getNrOfDaysWithoutWorkPerWeek() {
        return 3;
    }
}
