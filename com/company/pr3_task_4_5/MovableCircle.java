package com.company.pr3_task_4_5;

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "x, y: " +
                this.center.x + " " +
                this.center.y + "\nxSpeed, ySpeed: " +
                this.center.xSpeed + ", " +
                this.center.ySpeed + "\nradius: " +
                this.radius;
    }

    @Override
    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }
}