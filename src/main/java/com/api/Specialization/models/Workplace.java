package com.api.Specialization.models;

public class Workplace {
    private String hospitalName;
    private String country;
    private String city;
    private String street;
    private int streetNo;

    public Workplace(String hospitalName, String country, String city, String street, int streetNo) {
        this.hospitalName = hospitalName;
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNo = streetNo;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }
}
