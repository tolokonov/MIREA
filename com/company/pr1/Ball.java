package com.company.pr1;
import java.lang.*;

class Ball {
    private double radius;
    private double square;
    private String color;

    public void setRadius(double radius){
        this.radius = radius;
        this.square = Math.PI * Math.pow(radius, 2);
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getSquare(){
        return square;
    }

    @Override
    public String toString() {
        return  "Ball: " + '\n' +
                "radius = " + radius + '\n' +
                "square = " + Math.ceil(square) + '\n' +
                "color = " + color;
    }
}
