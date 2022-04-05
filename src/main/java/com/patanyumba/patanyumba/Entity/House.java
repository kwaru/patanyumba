package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

/**
 * This is the abstract class for all houses
 * It has common routines and properties possessed by all houses
 * Each house type will inherit from this class.
 */

public abstract  class House {
    protected  double rentPayable;
    protected String waterSource;
    protected  String toiletType;
    protected String location;
    protected  String floorMaterial;
    protected HouseEnums garbageFee;


    public double getRentPayable() {
        return rentPayable;
    }

    public void setRentPayable(double rentPayable) {
        this.rentPayable = rentPayable;
    }

    public String getWaterSource() {
        return waterSource;
    }

    public void setWaterSource(String waterSource) {
        this.waterSource = waterSource;
    }

    public String getToiletType() {
        return toiletType;
    }

    public void setToiletType(String toiletType) {
        this.toiletType = toiletType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }


    public HouseEnums getGarbageFee() {
        return garbageFee;
    }

    public void setGarbageFee(HouseEnums garbageFee) {
        this.garbageFee = garbageFee;
    }
}
