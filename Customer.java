package com.cabbooking.entities;

import java.util.List;

public class Customer extends Person {
    Long customerId;
    List<Booking> bookingList;
    public Customer(String name, String emailId, Integer rating, Integer totalRides, String password) {
        super(name, emailId, rating, totalRides, password);
    }
    public Customer() {
    }

    public Customer(String name, String emailId, Integer rating, Integer totalRides, String password, Long customerId, List<Booking> bookingList) {
        super(name, emailId, rating, totalRides, password);
        this.customerId = customerId;
        this.bookingList = bookingList;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public List<Booking> getRideList() {
        return bookingList;
    }

    public Customer setRideList(List<Booking> bookingList) {
        this.bookingList = bookingList;
        return this;
    }

}
