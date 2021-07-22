package com.company;

public class Car implements Vehicle {


    public void horn() {
        System.out.println("Car Hoooonk!!!");
    }
    public void startEngine() {
        System.out.println(" Car engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public void stopEngine(boolean isOn) {

    }
}
