package com.cabbooking.entities;

public class Address {
    public String getDoorNo() {
        return doorNo;
    }

    public Address setDoorNo(String doorNo) {
        this.doorNo = doorNo;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public Address setPinCode(Long pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public Address(String doorNo, String streetName, String district, String state, Long pinCode) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }

    String doorNo;
    String streetName;
    String district;
    String state;
    Long pinCode;
}
