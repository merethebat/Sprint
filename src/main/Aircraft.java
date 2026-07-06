package com.example.airportapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String airlineName;

    private int numberOfPassengers;

    @ManyToMany
    @JoinTable(
            name = "aircraft_airport",
            joinColumns = @JoinColumn(name = "aircraft_id"),
            inverseJoinColumns = @JoinColumn(name = "airport_id")
    )
    @JsonIgnoreProperties("aircraft")
    private List<Airport> airports = new ArrayList<>();

    @ManyToMany(mappedBy = "aircraft")
    @JsonIgnoreProperties("aircraft")
    private List<Passenger> passengers = new ArrayList<>();

    public Aircraft() {
    }

    public Aircraft(String type, String airlineName, int numberOfPassengers) {
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}