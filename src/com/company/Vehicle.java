package com.company;

public abstract class Vehicle {

    protected int wheelCount;
    protected String vehicleType;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    protected abstract void getInfo();

}
