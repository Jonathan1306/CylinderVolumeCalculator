package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if(this.radius < 0){
            radius=0;
        }
        return radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
}
