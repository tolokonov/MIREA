package com.company.pr3_task_1_3;

class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(){
        this.filled = false;
        this.color = "red";
        this.width = 1;
        this.length = 2;
    }

    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "red";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
