package com.cabbooking.entities;

import com.cabbooking.enums.VehicleStatus;
import com.cabbooking.enums.VehicleType;


public class Vehicle {
    Long id;
    VehicleType vehicleType;
    VehicleStatus vehicleStatus;
    Driver driver;

    public Vehicle(Long id, VehicleType vehicleType, VehicleStatus vehicleStatus, Driver driver) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.vehicleStatus = vehicleStatus;
        this.driver = driver;
    }
    public Vehicle() {

    }

    public Long getId() {
        return id;
    }

    public Vehicle setId(Long id) {
        this.id = id;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public Vehicle setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
        return this;
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle setDriver(Driver driver) {
        this.driver = driver;
        return this;
    }
}
