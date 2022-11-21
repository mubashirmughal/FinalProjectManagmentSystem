package model.vehicle;

public class Motorcycle extends Vehicle {
    private final boolean sideCar;

    public Motorcycle(String make, String plate, String color, String category, boolean sideCar) {
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    public boolean isSideCar() {
        return sideCar;
    }
}
