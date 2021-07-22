package com.company.shapes;


public class Square implements Shapes {

    private float sideOne;


    public Square(float sideOne){
        this.sideOne = sideOne;
    }

    public float getSideOne() {
        return sideOne;
    }

    public void setSideOne(float sideOne) {
        this.sideOne = sideOne;
    }

    public float getPerimeter(){
        return (float) (sideOne * 4);
    }

    public float getArea() {
        return (float) (Math.pow(sideOne, 2));
    }
}
