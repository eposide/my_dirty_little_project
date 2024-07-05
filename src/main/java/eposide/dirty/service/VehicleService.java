package eposide.dirty.service;
import eposide.dirty.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    private final static String username = "admin";
    private final static String password = "$0m3$3cr3t";

    private ArrayList<Vehicle> vehicles;

    public VehicleService() {
        vehicles = new ArrayList<Vehicle>();
        // Adding some vehicles
        vehicles.add(new Vehicle("1", "Toyota", "Camry"));
        vehicles.add(new Vehicle("2", "Honda", "Civic"));
        vehicles.add(new Vehicle("3", "Ford", "Mustang"));
    }

    public Vehicle getVehicleById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        return null; // This could be a potential bug (returning null)
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String id) {

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
        }
    }

    // This method has a bug (dividing by zero)
    public int calculateVehicleAverage(int totalVehicles) {
        int average = totalVehicles / vehicles.size();
        return average;
    }

    // This method has a code smell (unused parameter)
    public void printVehicleDetails(Vehicle vehicle) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    // This method has a potential bug (incorrect handling of null)
    // The method naming convention is also incorrect
    public void UpdateVehicle(String id, String make, String model) {

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        Vehicle vehicle = getVehicleById(id);
        if (vehicle != null) {
            vehicle.setMake(make);
            vehicle.setModel(model);
        } else {
            System.out.println("Vehicle not found"); // Using console print instead of proper logging
        }
    }


    // unused private method
    private void printAllVehicleDetails() {

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
