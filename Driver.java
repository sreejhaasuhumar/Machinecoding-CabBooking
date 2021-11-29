package com.cabbooking.entities;

import java.util.List;

public class Driver extends Person {
    Long driverId;
    List<Booking> bookings;
    Vehicle vehicle;

    public Long getDriverId() {
        return driverId;
    }

    public Driver setDriverId(Long driverId) {
        this.driverId = driverId;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Driver setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }
    public Driver() {
    }

    public Driver(String name, String emailId, Integer rating, Integer totalRides, String password, Long driverId, Vehicle vehicle) {
        super(name, emailId, rating, totalRides, password);
        this.driverId = driverId;
        this.vehicle = vehicle;
    }


    public Driver(String name, String emailId, Integer rating, Integer totalRides, String password) {
        super(name, emailId, rating, totalRides, password);
    }
}
