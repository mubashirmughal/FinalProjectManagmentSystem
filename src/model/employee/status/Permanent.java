package model.employee.status;

public class Permanent {
    private int nbChildrens;
    private boolean married = false;
    private double monthlySalary;
    private double bonusPerChildPerMonth;
    private int accumulatedDays;

    public Permanent(int nbChildrens, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays){
        this.nbChildrens = nbChildrens;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }
    public double accumulatedSalary() {
        int WORKING_DAYS_MONTHLY = 20;

        if (married){
            double totalBonusChildren = bonusPerChildPerMonth * nbChildrens;
            return (accumulatedDays * (monthlySalary + totalBonusChildren)) / WORKING_DAYS_MONTHLY * 12;
        }
        return (accumulatedDays * (monthlySalary) / WORKING_DAYS_MONTHLY) * 12;
    }

    public int getNbChildren() {
        return this.nbChildrens;
    }

    public boolean getMarried () {
        return this.married;
    }

    public int getAccumulatedDays(){
        return this.accumulatedDays;
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }

}
