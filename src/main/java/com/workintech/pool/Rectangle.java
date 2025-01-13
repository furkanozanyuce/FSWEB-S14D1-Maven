package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    //constructor
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    //getter
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //method
    public double getArea() {
        return width * length;
    }
}
