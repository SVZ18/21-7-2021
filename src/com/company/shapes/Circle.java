package com.company.shapes;

import com.company.shapes.Shapes;

public class Circle implements Shapes {

    //define properties of circle
    private float r;

    //define constructor
    public Circle(float r){
        this.r = r;
    }

    //getters and setters
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    //get area and get perimeter

    public float getArea() {
        return (float) (Math.PI * Math.pow(r, 2));
    }
    public float getPerimeter() {
        return (float) (2 * Math.PI * r);
    }
}
