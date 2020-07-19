package com.company1;

public class Company {
    private Country country;
    private String companyName;

    public Company(Country country, String companyName) {
        this.country = country;
        this.companyName = companyName;
    }

    public Company() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
