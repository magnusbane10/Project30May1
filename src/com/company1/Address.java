package com.company1;

public class Address {
    private Country country;
    private String city;
    private String postalCod;

    public Address(Country country, String city, String postalCod) {
        this.country = country;
        this.city = city;
        this.postalCod = postalCod;
    }

    public Address() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCod() {
        return postalCod;
    }

    public void setPostalCod(String postalCod) {
        this.postalCod = postalCod;
    }
}
