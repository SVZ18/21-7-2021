package com.company;

public class Bicycle implements Vehicle {

    public void horn() {
        System.out.println("Does not horn, bell dings");

    }


    public void startEngine() {
        System.out.println("Does not have engine, pedal with your feet");
    }

    public void stopEngine() {

    }

    public void stopEngine(boolean isOn) {
        if(isOn) {
            System.out.println("Stop pedalling");

        } else {
            System.out.println("Bicycle is not in use");
        }
    }

}
