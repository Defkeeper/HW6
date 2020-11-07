package com.company;

public class Motorcycle extends Vehicle implements Costable{
private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }
    @Override
    protected void getInfo() {
        System.out.println("Транспортное средство: Мотоцикл" + ", " + "Количество колес:" + wheelCount + ", " + "Максимальная скорость:" + maxSpeed + "км/ч");
    }


    @Override
    public int getCost() {
        int cost;
        if (maxSpeed < 100){
            cost = 1000;
        } else {
            cost = 2000;
        }
        return cost;
    }
}
