package com.company.pr1;

import com.company.pr1.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setColor("white");
        ball.setRadius(5.44);

        System.out.println();
        System.out.println(ball.toString());
    }
}
