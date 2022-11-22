package model.employee.status;

public class Temporary {
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary (double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary(){
        return this.hourlySalary;
    }
    public int getAccumulatedHours(){
        return this.accumulatedHours;
    }
    public double accumulatedSalary(){
        return hourlySalary * accumulatedHours * 12;
    }
}
