package com.company.pr3_task_1_3;

class Square extends Rectangle {
    protected double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}
