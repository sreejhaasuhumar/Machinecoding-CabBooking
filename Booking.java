package com.cabbooking.entities;

import com.cabbooking.enums.PaymentMethod;
import com.cabbooking.enums.VehicleStatus;

public class Booking {
    Driver driver;

    public Customer getCustomer() {
        return customer;
    }

    public Booking setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    Customer customer;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Booking setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    Vehicle vehicle;

    public Driver getDriver() {
        return driver;
    }

    public Booking setDriver(Driver driver) {
        this.driver = driver;
        return this;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public Booking setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
        return this;
    }

    Long rideId;
    String startingLocation;
    String destination;
    Long fareDetails;
    Long customerRating;
    Long driverRating;
    VehicleStatus vehicleStatus;
    PaymentMethod paymentMethod;

    public Booking(Long rideId, String startingLocation, String destination, Long fareDetails, Long customerRating, Long driverRating, PaymentMethod paymentMethod) {
        this.rideId = rideId;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.fareDetails = fareDetails;
        this.customerRating = customerRating;
        this.driverRating = driverRating;
        this.paymentMethod = paymentMethod;
    }
    public Booking() {

    }

    public Long getRideId() {
        return rideId;
    }

    public Booking setRideId(Long rideId) {
        this.rideId = rideId;
        return this;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public Booking setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public Booking setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public Long getFareDetails() {
        return fareDetails;
    }

    public Booking setFareDetails(Long fareDetails) {
        this.fareDetails = fareDetails;
        return this;
    }

    public Long getCustomerRating() {
        return customerRating;
    }

    public Booking setCustomerRating(Long customerRating) {
        this.customerRating = customerRating;
        return this;
    }

    public Long getDriverRating() {
        return driverRating;
    }

    public Booking setDriverRating(Long driverRating) {
        this.driverRating = driverRating;
        return this;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public Booking setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
}
