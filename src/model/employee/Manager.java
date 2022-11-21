package model.employee;

import model.vehicle.Car;

public class Manager extends Employee{
    private final int nbClients;
    private final int nbTravelDays;
    private Car employeeVehicle;

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Car employeeVehicle) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.employeeVehicle = employeeVehicle;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
    }

}
