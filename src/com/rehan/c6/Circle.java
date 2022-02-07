package com.rehan.c6;

public class Circle {
    private int radius;
    private static final double pi = 3.1415;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }
}
