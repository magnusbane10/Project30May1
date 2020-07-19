package com.company1;

public class Country {
    private String countryName;
    private String cod;
    private boolean isEU;


    public Country(String countryName, String cod, boolean isEU) {
        this.countryName = countryName;
        this.cod = cod;
        this.isEU = isEU;
    }

    public Country() {
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public boolean isEU() {
        return isEU;
    }

    public void setEU(boolean EU) {
        isEU = EU;
    }
}
