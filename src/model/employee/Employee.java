package model.employee;

import model.vehicle.Vehicle;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private int rate = 100;
    private Vehicle employeeVehicle;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Employee(String name, int birthYear, int rate) {
        this(name, birthYear);
        this.rate = rate;
    }

    public Employee(String name, int birthYear, double monthlyIncome, int rate) {
        this(name, birthYear, rate);
        this.monthlyIncome = monthlyIncome;
    }

    public Employee(String name, int birthYear, double monthlyIncome, int rate, Vehicle employeeVehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.rate = rate;
        this.employeeVehicle = employeeVehicle;
    }

    public double annualIncome() {
        return (12 * monthlyIncome * rate / 100);
    }

}

