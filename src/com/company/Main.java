package com.company;
import java.util.Scanner;

import com.company.MathConstants;
import com.company.shapes.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(MathConstants.PI.getNumber());
//        System.out.println(MathConstants.AVOGADRO_CONSTANT.getNumber());
//        System.out.println(MathConstants.PYTHAGORAS_CONSTANT.getNumber());
//        System.out.println(MathConstants.THEODORUS_CONSTANT.getNumber());
//        System.out.println(MathConstants.AVOGADRO_NUMBER.getNumber());
//        System.out.println(MathConstants.IMAGINARY_UNIT.getNumber());

//        Car newCar = new Car();
//        newCar.horn();

//        Motorcycle mCycle = new Motorcycle();
//        mCycle.horn();

//        Vehicle car = new Car(); //
//        car.startEngine();

//        Vehicle mCycle = new Motorcycle();
//        mCycle.startEngine();

//        Vehicle bike = new Bicycle();
//        bike.horn();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        Shapes circle = new Circle(sc.nextFloat());

        System.out.println("Circumference of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getPerimeter());
        System.out.println();

        System.out.println("Enter the length of the rectangle: ");
        float length = sc.nextFloat();

        System.out.println("Enter the breadth of the rectangle: ");
        float breadth = sc.nextFloat();

        Shapes rectangle = new Rectangle(length, breadth);
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println();


//        System.out.println("Enter the length of a side of a triangle: ");
//        Shapes triangle = new Triangle(sc.nextFloat());

//        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
 //       System.out.println("Area of the triangle: " + triangle.getArea());

        System.out.println("Enter the length of a side of a square: ");
        Shapes square = new Square(sc.nextFloat());

        System.out.println("Perimeter of the square: " + square.getPerimeter());
        System.out.println("Area of the square: " + square.getArea());
    }
}

