package com.company;

public class Main {

    public static void main(String[] args) {
        Car vehicle1 = new Car(4, 5);
        Car vehicle2 = new Car(4, 3);
        Motorcycle vehicle3 = new Motorcycle(2, 170);
        Motorcycle vehicle4 = new Motorcycle(2, 50);
        vehicle1.getInfo();
        vehicle2.getInfo();
        vehicle3.getInfo();
        vehicle4.getInfo();
        System.out.println("Стоимость 1-ого ТС: " + vehicle1.getCost());
        System.out.println("Стоимость 2-ого ТС: " + vehicle2.getCost());
        System.out.println("Стоимость 3-его ТС: " + vehicle3.getCost());
        System.out.println("Стоимость 4-ого ТС: " + vehicle4.getCost());

    }
}
