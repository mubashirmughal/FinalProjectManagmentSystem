package model.employee;

import model.vehicle.Vehicle;

public class Programmer extends Employee {

    private int nbProjects;
    private Vehicle employeeVehicle;
    private static final int GAIN_FACTOR_PROJECTS = 200;

    public Programmer(String name, int birthYear, int nbProjects, Vehicle employeeVehicle) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.employeeVehicle = employeeVehicle;
    }
}


