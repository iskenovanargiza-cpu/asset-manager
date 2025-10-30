package com.pluralsight.model;

public class Cash extends Asset{
    private double cash;

    public Cash(String description, String dateAcquired, double originalCost, double cash) {
        super(description, dateAcquired, originalCost);
        this.cash = cash;

    }
    @Override
    public double getValue() {
        return cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}

