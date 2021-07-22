package com.company.shapes;

public class Rectangle implements Shapes {
    //properties
    private float length;
    private float breadth;

    //constructor
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //getters and setters

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getArea() {
        return length * breadth;
    }
    public float getPerimeter() {
        return 2 * (length + breadth);
    }
}
