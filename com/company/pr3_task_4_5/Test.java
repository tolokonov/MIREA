package com.company.pr3_task_4_5;

public class Test {
    public static void main(String[] args) {
        MovableCircle point = new MovableCircle(5, 5, 1, 1, 2);
        System.out.println(point);
        System.out.println();
        point.moveDown();
        System.out.println(point);
        System.out.println();

        MovableRectangle rectangle = new MovableRectangle(6, 7, 8, 5, 1, 1);
        System.out.println(point);
        System.out.println();
        point.moveDown();
        System.out.println(point);
    }
}
