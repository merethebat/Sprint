package com.example.airportapi.model;

public class Airport {
    private Long id;
    private String name;
    private String location;

    public Airport() {
    }

    public Airport(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getCode() {
        throw new UnsupportedOperationException("Unimplemented method 'getCode'");
    }

    public void setCode(Object code) {
        throw new UnsupportedOperationException("Unimplemented method 'setCode'");
    }

    public Object getCity() {
        throw new UnsupportedOperationException("Unimplemented method 'getCity'");
    }

    public void setCity(Object city) {
        throw new UnsupportedOperationException("Unimplemented method 'setCity'");
    }
}
