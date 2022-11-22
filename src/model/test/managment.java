package model.test;

import model.employee.Employee;
import model.vehicle.Motorcycle;
import model.vehicle.Vehicle;

import java.lang.reflect.Type;

public class managment extends Motorcycle{
    static double workingDaysPerMonth = 20.0;

    public managment(String make, String plate, String color, String category, boolean sideCar) {
        super(make, plate, color, category, sideCar);
    }

    //"Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle", false
    public void motorcycle(String make, String plate, String color, String category, boolean sideCar){
        Vehicle.setMake("Kawasaki");
        Vehicle.setPlate("Custom Plate");
        System.out.println();
    }

   // Type employee = [Employee]();

}
