public class Car {
    private String make;
    private String model;
    private double mpg;
    private double capacity;

    public Car(String make, String model, double mpg, double capacity) {
        this.make = make;
        this.model = model;
        this.mpg = (mpg < 0) ? 0.0 : mpg;
        this.capacity = (capacity < 0) ? 0.0 : capacity;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMpg() {
        return mpg;
    }

    public double getCapacity() {
        return capacity;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double findMaxRange() {
        return mpg * capacity;
    }

    @Override
    public String toString() {
        // String representation of the Car object
        return "Make: " + make + ", Model: " + model + ", MPG: " + mpg + ", Capacity: " + capacity + " gallons";
    }
}
