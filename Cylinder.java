package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(this.height < 0){
            height=0;
        }
        return height;
    }
    public double getVolume(){
        return getHeight()*getArea();
    }
}
