package eposide.dirty.api;

import eposide.dirty.model.Vehicle;

import java.util.ArrayList;

public class VehicleService {

    public String GetVehicleById(String ID) {

        String vehicle = "";
        eposide.dirty.service.VehicleService service = null;

        try {
            service = new eposide.dirty.service.VehicleService();
            Vehicle vehicleObj = service.getVehicleById("1");

            vehicle = vehicleObj.toString();
        } catch (Throwable t) {
            //catching a throwable and not sure how to handle it
        }

        return vehicle;
    }


    public ArrayList<String> getAllVehicles() {

        ArrayList<String> list = new ArrayList<String>();

        eposide.dirty.service.VehicleService service = null;

        try {
            service = new eposide.dirty.service.VehicleService();
            ArrayList<Vehicle> vehiclelist = service.getAllVehicles();

            for (Vehicle vehicle : vehiclelist) {
                list.add(vehicle.toString());
            }

        } catch (Throwable t) {
            // catching a throwable and not sure how to handle it
        }
        return list;


    }


    public void addVehicle(String id, String make, String model) {

        eposide.dirty.service.VehicleService service = null;

        try {

            service = new eposide.dirty.service.VehicleService();

            Vehicle vehicle = new Vehicle(id, make, model);

            service.addVehicle(vehicle);

        } catch (Throwable t) {
            // catching a throwable and not sure how to handle it

        }

    }

    public void removeVehicle(String id) {

        eposide.dirty.service.VehicleService service = null;

        try {

            service = new eposide.dirty.service.VehicleService();


            service.removeVehicle(id);

        } catch (Throwable t) {
            // catching a throwable and not sure how to handle it

        }

    }



}
