package com.pluralsight.model;

public class Vehicle extends Asset {
    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        int currentYear = 2025;
        int carAge = currentYear - this.year;
        double cost = this.originalCost;

        if (carAge >= 3) {
            cost *= .97; //Minus 3%
        } else if (carAge <= 6) {
            cost *= .94; //Minus 6%
        } else if (carAge <= 10) {
            cost *= .92; //Minus 8%
        } else {
            cost = 1000;
        }
        if (this.odometer > 100000 && !this.makeModel.contains("Honda") && !this.makeModel.contains("Toyota")) {
            cost *= .75;
        }
        return cost;
    }
}
