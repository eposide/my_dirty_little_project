package eposide.dirty.model;

public class Vehicle {
    private String id;
    private String make;
    private String model;
    private int year;



    public Vehicle(String id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Vehicle{id='" + id + "', make='" + make + "', model='" + model + "', model='" + year + "'}";
    }
}
