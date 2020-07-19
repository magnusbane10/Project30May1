package com.company1;

public class Faculty {
    private Country country;
    private String university;
    private String facultyName;

    public Faculty(Country country, String university, String facultyName) {
        this.country = country;
        this.university = university;
        this.facultyName = facultyName;
    }

    public Faculty() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
