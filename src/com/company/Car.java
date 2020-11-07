package com.company;

public class Car extends Vehicle implements Costable {
    private int doorsCount;

    @Override
    protected void getInfo() {
        System.out.println("Транспортное средство: Машина" + ", " + "Количество колес:" + wheelCount + ", " + "Количество дверей:" + doorsCount);
    }

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    public int getCost() {
        int cost;
        if (doorsCount < 4){
            cost = 1000;
        } else {
            cost = 2000;
        }
        return cost;
    }
}

