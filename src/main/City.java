package com.example.airportapi.model;

public class City {
    private Long id;
    private String name;
    private String country;

    public City() {
    }

    public City(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getState() {
        throw new UnsupportedOperationException("Unimplemented method 'getState'");
    }

    public void setState(Object state) {
        throw new UnsupportedOperationException("Unimplemented method 'setState'");
    }

    public Object getPopulation() {
        throw new UnsupportedOperationException("Unimplemented method 'getPopulation'");
    }

    public void setPopulation(Object population) {
        throw new UnsupportedOperationException("Unimplemented method 'setPopulation'");
    }
}
