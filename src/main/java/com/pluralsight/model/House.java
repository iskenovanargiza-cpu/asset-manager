package com.pluralsight.model;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address,int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue(){
        double pricePerSqFt = 0;
        if (condition == 1){
            pricePerSqFt = 180.00;
        } else if (condition == 2){
            pricePerSqFt = 130.00;
        } else if (condition == 3){
            pricePerSqFt = 90.00;
        } else if (condition == 4){
            pricePerSqFt = 80.00;
        } else {
            System.out.println("Error");
        }
        double houseValue = getSquareFoot() * pricePerSqFt;
        double landValue  = getLotSize() * 0.25;

        return houseValue + landValue;
    }
}


