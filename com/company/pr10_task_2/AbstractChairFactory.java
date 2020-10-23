package com.company.pr10_task_2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicalChair();
    FunctionalChair createFunctionChair();
}
