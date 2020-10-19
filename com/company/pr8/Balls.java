package com.company.pr8;

public class Balls {
    public int numberOfBall;

    public Balls(){
        this.numberOfBall = 0;
    }

    public Balls(int numberOfBall){
        this.numberOfBall = numberOfBall;
    }

    @Override
    public String toString() {
        return "NumberOfBall = " + numberOfBall;
    }
}
