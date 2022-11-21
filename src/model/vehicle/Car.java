package model.vehicle;

public class Car extends Vehicle {
    private final String gear;
    private final String type;

    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public String getGear() {
        return gear;
    }

    public String getType() {
        return type;
    }
}
