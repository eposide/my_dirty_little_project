package eposide.dirty.model;

public class Vehicle {
    protected String id;
    protected String make;
    protected String model;

    public Vehicle(String id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
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

    @Override
    public String toString() {
        return "Vehicle{id='" + id + "', make='" + make + "', model='" + model + "'}";
    }
}
