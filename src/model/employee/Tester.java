package model.employee;

import model.vehicle.Vehicle;

public class Tester extends Employee {
    private int nbBugs;
    private Vehicle employeeVehicle;
    private static final int GAIN_FACTOR_ERROR = 10;

    public Tester(String name, int birthYear, int rate, int nbBugs, Vehicle employeeVehicle) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
        this.employeeVehicle = employeeVehicle;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + (nbBugs * 10);
    }
}
