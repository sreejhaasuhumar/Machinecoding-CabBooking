package com.cabbooking.service;

import com.cabbooking.entities.Customer;
import com.cabbooking.entities.Driver;
import com.cabbooking.entities.Booking;
import com.cabbooking.entities.Vehicle;
import com.cabbooking.enums.VehicleStatus;
import com.cabbooking.enums.VehicleType;

import java.util.*;

public class CabBookingServiceImpl implements CabBookingService{
    Long rideId = 0L;
    Long vehicleId =0L;
    Long driverId = 0L;
    Map<String, Customer> customerMap = new HashMap<>();
    Map<String, Driver> driverMap = new HashMap<>();
    Map<String, Vehicle> vehicleNumMap = new HashMap<>();
    Map<Long, Driver> vehicleToDriverMap = new HashMap<>();
    Map<Long, Booking>  bookingMap = new HashMap<>();
    Map<VehicleType, List<Vehicle>> vehicleMap = new HashMap<>();
    @Override
    public void registerCustomer(String userName, String password) throws Exception {
        if(customerMap.containsKey(userName)) {
            throw new Exception("Already an user exists in this name");
        } else {
            Customer customer = new Customer();
            customer.setEmailId(userName);
            customer.setPassword(password);
            customer.setName(userName);
            customerMap.put(userName,customer);
        }


    }

    @Override
    public Customer login(String userName, String password) throws Exception {
        if(customerMap.containsKey(userName)) {
            Customer customer = customerMap.get(userName);
            if(customer.getPassword().equals(password)) {
                System.out.println(userName+ " "+"logged in");
                return customer;
            } else {
                throw new Exception("Invalid login details");
            }
        } else {
            throw new Exception("Invalid login details");
        }
    }

    @Override
    public Booking makeBooking(String startLocation, String destination, VehicleType vehicleType, Customer customer) throws Exception {
        try {
            if (vehicleMap.get(vehicleType) == null || vehicleMap.get(vehicleType).isEmpty()) {
                throw new Exception("No vehicles matching your criteria");
            } else {
                int i = 0;
                while (i < vehicleMap.get(vehicleType).size()) {
                    Vehicle vehicle = vehicleMap.get(vehicleType).get(i);
                    if (vehicle.getVehicleStatus() == VehicleStatus.AVAILABLE) {
                        vehicle.setVehicleStatus(VehicleStatus.BOOKED);
                        Driver driver = vehicleToDriverMap.get(vehicle.getId());
                        Booking booking = new Booking();
                        booking.setDestination(destination);
                        booking.setRideId(++rideId);
                        booking.setStartingLocation(startLocation);
                        booking.setDriver(driver);
                        booking.setVehicle(vehicle);
                        vehicleMap.get(vehicleType).remove(i);
                        Random random = new Random();
                        booking.setFareDetails(Math.abs(random.nextLong()) * 100);
                        booking.setCustomer(customer);
                        return booking;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public void addVehicle(String licenseNum, Driver driver) {

    }

    @Override
    public void registerDriver(String userName, String password, VehicleType vehicleType, String licenseNum) throws Exception {
        try {
            if (driverMap.containsKey(userName)) {
                throw new Exception("Already an user exists in this name");
            } else {
                Driver driver = new Driver();
                driver.setDriverId(++driverId);
                Vehicle vehicle = new Vehicle();
                vehicle.setVehicleStatus(VehicleStatus.AVAILABLE);
                vehicle.setId(++vehicleId);
                vehicleNumMap.put(licenseNum, vehicle);
                vehicle.setVehicleType(vehicleType);
                if (vehicleMap.get(vehicleType) == null || vehicleMap.get(vehicleType).isEmpty()) {
                    List<Vehicle> vehicles = new ArrayList<>();
                    vehicles.add(vehicle);
                    vehicleMap.put(vehicleType, vehicles);
                } else {
                    List presentVehicles = vehicleMap.get(vehicleType);
                    presentVehicles.add(vehicle);
                    vehicleMap.put(vehicleType, presentVehicles);
                }
                driver.setEmailId(userName);
                driver.setPassword(password);
                driver.setName(userName);
                driver.setDriverId(++driverId);
                driverMap.put(userName, driver);
                vehicleToDriverMap.put(vehicleId, driver);
                System.out.println("User "+userName+" is successfully registered");
            }
        }  catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void loginDriver(String userName, String password) {

    }

    @Override
    public boolean cancelBooking(Booking booking) {
        return false;
    }
}
