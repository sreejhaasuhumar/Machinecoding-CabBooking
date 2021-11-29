package com.cabbooking.service;

import com.cabbooking.entities.Customer;
import com.cabbooking.entities.Driver;
import com.cabbooking.entities.Booking;
import com.cabbooking.enums.VehicleType;

public interface CabBookingService {
    public void registerCustomer(String userName, String password) throws Exception;

    public Customer login(String userName, String password) throws Exception;

    public Booking makeBooking(String startLocation, String destination, VehicleType vehicleType, Customer customer) throws Exception;

    public void addVehicle(String licenseNum, Driver driver);

    public void registerDriver(String userName, String password, VehicleType vehicleType, String licenseNum) throws Exception;

    public void loginDriver(String userName, String password);

    public boolean cancelBooking(Booking booking);
}
