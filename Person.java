package com.cabbooking.entities;

public abstract class Person {
    String name;
    String emailId;
    Integer rating;
    Integer totalRides;
    String password;

    public Person() {
    }

    public Person(String name, String emailId, Integer rating, Integer totalRides, String password) {
        this.name = name;
        this.emailId = emailId;
        this.rating = rating;
        this.totalRides = totalRides;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public Person setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public Integer getRating() {
        return rating;
    }

    public Person setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public Integer getTotalRides() {
        return totalRides;
    }

    public Person setTotalRides(Integer totalRides) {
        this.totalRides = totalRides;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Person setPassword(String password) {
        this.password = password;
        return this;
    }
}
