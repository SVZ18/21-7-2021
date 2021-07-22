package com.company.shapes;

import com.company.shapes.Shapes;

public class Triangle implements Shapes {

    //properties
    private float side;

    //getters and setters

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    //get area and perimeter
    public float getPerimeter() {
        return (float) (side * 3);
    }

    public float getArea() {
        return (float) ((Math.pow(side, 2) * Math.sqrt(3)) / 4);
    }
}
