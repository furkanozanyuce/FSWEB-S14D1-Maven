package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    //constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //getter
    public double getHeight() {
        return height;
    }

    //method
    public double getVolume() {
        return getArea() * height;
    }
}
