package com.company;
public enum MathConstants {
    PI(3.14), // (Math.PI),
    PYTHAGORAS_CONSTANT(Math.sqrt(-2)),
    THEODORUS_CONSTANT( Math.sqrt(3)),
    IMAGINARY_UNIT(Math.sqrt(-1)),
    AVOGADRO_NUMBER(6.02214076 * Math.pow(10, 23)),
    AVOGADRO_CONSTANT(6.02);

    //create properties to hold these values
    private final double number;

    //constructor
    MathConstants(double number){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
