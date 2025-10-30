package com.pluralsight;
import com.pluralsight.model.Asset;
import com.pluralsight.model.House;
import com.pluralsight.model.Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Asset> assets = new ArrayList<>();
        assets.add(new House("My Primary House", "2015-06-01", 180000,"123 Apple St",1,2000,5000));
        assets.add(new House("My Vacation House", "2020-03-08", 90000,"123 Apple St",3,2000,5000));

        assets.add(new Vehicle("My Car", "2019-03-12", 22000, "Dodge Charger SXT", 3, 45000));
        assets.add(new Vehicle("My leisure Car", "2018-03-12", 35000, "Mercedes Benz SL550", 2, 45000));

        Asset a = new Asset("pepe","last year", 180000);

        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired());
            System.out.println(asset.getOriginalCost());
            System.out.println(asset.getValue());

            if (asset instanceof House){
                House house = (House) asset;
                System.out.println("This is house located" + " " + house.getAddress());
            } else if (asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle:" + vehicle.getYear() + " "+ vehicle.getMakeModel());
            }
        }
        System.out.println();

    }
}

