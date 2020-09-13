package com.company.pr2;

class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){
        this.x = 5.5;
        this.y = 5.7;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Position of the Ball: " + this.x + ", " + this.y;
    }
}

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.move(300, 350);
        System.out.println(ball);
    }
}
