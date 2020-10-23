package com.company.pr10_task_2;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(){
        return new VictorianChair(200);
    }
    public MagicChair createMagicalChair(){
        return new MagicChair();
    }
    public FunctionalChair createFunctionChair(){
        return new FunctionalChair();
    }
}
