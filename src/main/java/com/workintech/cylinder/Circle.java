package com.workintech.cylinder;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //getter
    public double getRadius() {
        return radius;
    }

    //method
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
